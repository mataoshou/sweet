package frame.sys;

import org.apache.log4j.Logger;
//任务对象
public abstract class BaseTask extends Thread
{
	Logger logger;

	boolean isCircle = true;// 是否循环 默认循环
	long interval = 1000 * 60 * 60;//  循环时间间隔 默认时间间隔为1小时

	/**
	 * 设置任务循环状态 true 循环 ; false 执行一次
	 */
	public void setCircle(boolean isCircle)
	{
		this.isCircle = isCircle;
	}

	/**
	 * 设置循环时间间隔 时间单位 毫秒
	 */
	public void setInterval(long interval)
	{
		this.interval = interval;
	}
	/**
	 * 获取循环时间间隔 时间单位 毫秒
	 */
	public long getInterval()
	{
		return interval;
	}

	/**
	 * 启动线程
	 */
	public void startService()
	{
		logger=Logger.getLogger(getClass());
		logger.debug("启动任务");
		start();
	}
	/**
	 * 停止线程
	 */ 
	public void stopService()
	{
		this.interrupt();
		try
		{
			this.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				excute();
			} catch (Exception e)
			{
				e.printStackTrace();
			} finally
			{
				if (!isCircle)
					break;// 循环状态为false 停止循环 （只循环一次）
			}
			try
			{
				Thread.sleep(interval);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * 任务函数
	 */
	public abstract void excute();

}

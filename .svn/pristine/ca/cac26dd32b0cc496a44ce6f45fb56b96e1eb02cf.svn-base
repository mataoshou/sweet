package frame.sys;

import java.util.ArrayList;
import java.util.List;

public class CacheManager extends Thread
{
	static CacheManager one;

	public static CacheManager i()
	{
		if (one == null)
		{
			one = new CacheManager();
		}
		return one;
	}
	
	/**
	 * 启动线程
	 */
	public void startService()
	{
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
	
	//缓存数据列表
	List<BaseCache> list = new ArrayList();

	@Override
	public void run()
	{
		while (true)
		{
			for (BaseCache c : list)
			{
				try
				{
					if (c != null
							&& System.currentTimeMillis() - c.lastTime >= c.interval)
					{
						c.initData();
						c.lastTime = System.currentTimeMillis();
					}
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	//添加数据缓存
	public void add(BaseCache cache)
	{
		list.add(cache);
	}
	//删除数据缓存
	public void remove(BaseCache cache)
	{
		int no = list.indexOf(cache);
		if (no >= 0)
		{
			list.remove(no);
		}
	}

}

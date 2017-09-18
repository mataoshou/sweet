package frame.sys;

class TaskUtil
{
	public static void startTask()
	{
		//启动缓存任务
		CacheManager.i().startService();
	}
}

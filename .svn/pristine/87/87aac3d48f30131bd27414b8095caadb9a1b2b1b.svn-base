package frame.sys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import tool.common.Convert;

//缓存对象
public abstract class BaseCache<T, G>
{
	long interval = 1000 * 60 * 60;// 循环时间间隔 默认时间间隔为1小时
	Map<T, G> m_map = new HashMap();// 缓存数据
	long lastTime = 0;// 最后更新时间

	//添加缓存到缓存任务中
	public void addToCache()
	{
		CacheManager.i().add(this);
	}

	/**
	 * 设置循环时间间隔 时间单位 毫秒
	 */
	public void setInterval(long interval)
	{
		this.interval = interval;
	}

	/**
	 * 任务函数
	 */
	protected abstract void excute();

	/**
	 * 添加缓存数据
	 */
	public void add(T key, G value)
	{
		m_map.put(key, value);
	}

	/**
	 * 清理缓存数据
	 */
	public void clean()
	{
		m_map.clear();
	}

	/**
	 * 删除指定key的缓存数据
	 */
	public void remove(Object key)
	{
		m_map.remove(key);
	}

	/**
	 * 获取指定key的缓存数据
	 */
	public G get(Object key)
	{
		return m_map.get(key);
	}

	/**
	 * 获取所有缓存数据
	 */
	public List list()
	{
		return Convert.valuetoList(m_map);
	}

	public List list(Object... o)
	{
		List list = null;
		return list;
	}

	/**
	 * 更新数据
	 */
	public void initData()
	{
		excute();
	}
}

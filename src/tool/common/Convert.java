package tool.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 数据类型的转换
 */
public class Convert
{
	// 数组转换为List
	public static List toList(Object[] os)
	{
		List result = new ArrayList();
		Collections.addAll(result, os);
		return result;
	}
	//list转数组
	public static Object[] toArray(List list)
	{
		Object[] array = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) 
		{
			array[i] = list.get(i);
		}
		return array;
	}

	// map的key转换为List
	public static List keytoList(Map map)
	{
		Iterator it = map.keySet().iterator();
		List result = new ArrayList();
		while (it.hasNext())
		{
			result.add(it.next());
		}
		return result;
	}

	// map的value转换为List
	public static List valuetoList(Map map)
	{
		Iterator it = map.values().iterator();
		List result = new ArrayList();
		while (it.hasNext())
		{
			result.add(it.next());
		}
		return result;
	}
}

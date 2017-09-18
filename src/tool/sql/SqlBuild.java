package tool.sql;

import java.util.ArrayList;
import java.util.List;

public class SqlBuild
{
	List<String> list=new ArrayList();
	
	public void addParam(String name,Object value)
	{
		list.add(name+" = "+value);
	}
	
	//in
	public void addIn(String name,List list)
	{
		String param=name+" in(";
		for(int i=0;i<list.size();i++)
		{
			if(i>0)param+=",";
			param+=list.get(i);
		}
		param+=")";
		list.add(param);
	}
	
	//过滤条件
	public String toWhere()
	{
		String where=" WHERE ";
		for(int i=0;i<list.size();i++)
		{
			if(i>0)where+=" AND ";
			where+=list.get(i);
		}
		return where;
	}
	//数据设置
	public String toSet()
	{
		String set=" SET ";
		for(int i=0;i<list.size();i++)
		{
			if(i>0)set+=" , ";
			set+=list.get(i);
		}
		return set;
	}
}

package business.util;

import java.util.List;

import frame.hibernate.DBUtil;

import tool.common.GuidUtils;
import tool.sql.SqlBuild;
import business.db.SweetUser;

public class UserUtils
{
	public static SweetUser empty()
	{
		SweetUser user=new SweetUser();
		user.setGuid(GuidUtils.guid2());
		user.setFlagDeleted(false);
		return user;
	}
	
	
	public static List list() throws Exception
	{
		SqlBuild build=new SqlBuild();
		build.addParam("flagDeleted", 0);
		String sql=" FROM SweetUser "+build.toWhere();
		List list= DBUtil.list(sql, false);
		return list;
	}
	
	public static void main(String[] args)
	{
		try
		{
			List list=list();
			for(int i=0;i<list.size();i++)
			{
				SweetUser u=(SweetUser) list.get(i);
				System.out.println(u.getId());
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

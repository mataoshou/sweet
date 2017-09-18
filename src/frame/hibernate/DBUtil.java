package frame.hibernate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;

public class DBUtil
{
	public static Timestamp now () 
	{
		return new Timestamp(System.currentTimeMillis());
	}
	public static String nowstr () 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format( now() );
	}
	
	// 保存一行 (row为MAP后的对象)
	public static Object save (Object row)  throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			dbss.beginTransaction();
			dbss.save(row);
			dbss.getTransaction().commit();
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
		return row;
	}
	
	// 更新一行 (row为MAP后的对象)
	public static Object update(Object row)  throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			dbss.beginTransaction();
			dbss.update(row);
			dbss.getTransaction().commit();
			return row;
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
	}
	
	// 保存或更新一行 (row为MAP后的对象)
	public static Object saveOrUpdate(Object row)  throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			dbss.beginTransaction();
			dbss.saveOrUpdate(row);
			dbss.getTransaction().commit();
			return row;
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
	}
	
	// 获取唯一一行 (需自己构造SQL语句, 并注明是否HQL)
	public static Object get (String sql, boolean nativeSQL) throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			List rawdata = null;
			if(nativeSQL)
				rawdata = dbss.createSQLQuery(sql).list();
			else
				rawdata = dbss.createQuery(sql).list();

			if(rawdata.size()  > 0)
				return rawdata.get(0);
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
		return null;
	}
	// 获取多行 (需自己构造SQL语句, 并注明是否HQL)
	public static List  list(String sql, boolean nativeSQL) throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			List rawdata = null;
			if(nativeSQL)
				rawdata = dbss.createSQLQuery(sql).list();
			else
				rawdata = dbss.createQuery(sql).list();

			return rawdata;
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
	}
	
	// 获取多行 (需自己构造SQL语句, 并注明是否HQL)
	public static List  listN(String sql, boolean nativeSQL, int N) throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			List rawdata = null;
			if(nativeSQL)
				rawdata = dbss.createSQLQuery(sql).setMaxResults(N).list();
			else
				rawdata = dbss.createQuery(sql).setMaxResults(N).list();

			return rawdata;
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
	}
	
	// 执行DELETE或UPDATE (需自己构造SQL语句, 并注明是否HQL)
	public static int execute (String sql, boolean nativeSQL)  throws Exception
	{
		Session dbss = HibernateSessionFactory.getSession();
		try
		{
			int ret = 0;
			dbss.beginTransaction();
			if(nativeSQL)
				ret = dbss.createSQLQuery(sql).executeUpdate();
			else
				ret = dbss.createQuery(sql).executeUpdate();
			dbss.getTransaction().commit();
			
			return ret;
		} finally
		{
			if (dbss != null)
				dbss.close();
		}
	}
	

}

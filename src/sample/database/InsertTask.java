package sample.database;

import tool.common.Shift;
import business.db.SweetTree;
import frame.hibernate.DBUtil;

public class InsertTask extends Thread
{
	int i = 0;

	public void setI(int no)
	{
		i = no;
	}

	@Override
	public void run()
	{
		String table = "sweet_tree_"
				+ Shift.leftZeroShift(String.valueOf(i), 5);

		String create = String.format("CREATE TABLE `%s` ("
				+ "`id` bigint(12) NOT NULL AUTO_INCREMENT,"
				+ "`code` varchar(56) DEFAULT NULL,"
				+ "`parent` varchar(56) DEFAULT NULL,"
				+ "`name` varchar(56) DEFAULT NULL," + "PRIMARY KEY (`id`)"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8;", table);
		String delete =String.format("DROP TABLE IF EXISTS `%s`;", table);
		try
		{
			DBUtil.execute(create, true);
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		System.out.println("开始插入数据"+i);
		String insert=String.format("insert  into `%s`(`code`,`parent`,`name`) values",table);
		int count=0;
		for (int j = 0; j < 10000; j++)
		{
			if(count!=0)insert+=",";
			insert+=String.format("('%s','%s','%s')"
					,Shift.leftZeroShift(String.valueOf(i), 5)+ Shift.leftZeroShift(String.valueOf(j), 5)
					,Shift.leftZeroShift(String.valueOf(i), 5),"tree" + i + j);
			count++;
			if(count==30||j==9999){
				count=0;
				try
				{
					//System.out.println(insert);
					DBUtil.execute(insert, true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				insert=String.format("insert  into `%s`(`code`,`parent`,`name`) values",table);
			}
		}
		System.out.println("结束插入数据"+i);
		String add=String.format("INSERT  INTO `sweet_tree`(`code`,`parent`,`name`) SELECT code,parent,name  FROM %s",
				table);
		
		try
		{
			DBUtil.execute(add, true);
			System.out.println("完成数据汇总"+i);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			DBUtil.execute(delete, true);
			System.out.println("删除数据表"+i);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

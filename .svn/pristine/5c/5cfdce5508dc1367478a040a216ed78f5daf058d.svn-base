package sample.database;

import java.util.ArrayList;
import java.util.List;

public class InsetData
{
	public static void main(String[] args){
		
		int count=0;
		List<InsertTask> list=new ArrayList();
		while(count<10000)
		{
			for(int i=0;i<list.size();i++ )
			{
				InsertTask insert =list.get(i);
				if(!insert.isAlive())
				{
					list.remove(i);
				}
			}
			int length=list.size();
			for(int i=length;i<50;i++)
			{
				InsertTask insert= new InsertTask();
				insert.setI(count++);
				list.add(insert);
				insert.start();
				System.out.println("...............启动第"+count+"个线程...............");
			}
			System.out.println(".......等待下一轮监测..........");
			try
			{
				Thread.sleep(1000*5);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		for(int i=0;i<10000;i++)
//		{
//			for(int j=0;j<10000;j++)
//			{
//				SweetTree tree =new SweetTree();
//				tree.setParent(Shift.leftZeroShift(String.valueOf(i),5));
//				tree.setCode(Shift.leftZeroShift(String.valueOf(i),5)+Shift.leftZeroShift(String.valueOf(j),5));
//				tree.setName("tree"+i+j);
//				try
//				{
//					DBUtil.save(tree);
//				} catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//			System.out.println(".......第"+i+"组完成...........");
//		}
	}
}

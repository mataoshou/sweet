package business.test;

import java.util.List;
import java.util.Random;

import business.cache.ProgramCache;
import business.db.SweetProgram;
import business.util.ProgramUtil;
import frame.hibernate.DBUtil;

public class ProgramTest
{
	public static void main(String[] args)
	{
		SweetProgram p=ProgramUtil.empty();
		p.setParent(0);
		p.setProgramName("左侧"+new Random().nextInt());
		
		
		try
		{
			DBUtil.save(p);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		List l =ProgramCache.one().list();
		for(int i=0;i<l.size();i++)
		{
			System.out.println(((SweetProgram)l.get(i)).getProgramName());
		}
	}
}

package business.util;

import java.util.List;

import business.cache.ProgramCache;
import business.db.SweetProgram;
import frame.hibernate.DBUtil;

public class ProgramUtil
{
	public  static SweetProgram empty(){
		SweetProgram program=new SweetProgram();
		program.setParent(0);
		program.setProgramName("");
		program.setTimeCreate(DBUtil.now());
		return program;
	}
	//获取栏目
	public static SweetProgram get(int programId) throws Exception{
		
		SweetProgram program= (SweetProgram) ProgramCache.one().get(programId);
		return program;
	}
	
	//获取栏目数据列表
	public static List list() throws Exception
	{
		String sql="FROM SweetProgram";
		List  l=DBUtil.list(sql, false);
		return l;
	}
}

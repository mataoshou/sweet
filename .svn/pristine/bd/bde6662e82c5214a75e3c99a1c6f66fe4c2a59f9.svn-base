package business.cache;

import java.util.List;

import business.db.SweetProgram;
import business.util.ProgramUtil;
import frame.sys.BaseCache;

//数据，获取、更新
public class ProgramCache extends BaseCache<Integer, SweetProgram>
{
	static ProgramCache single;
	/**
	 * 获取单例
	 */
	public static ProgramCache one()
	{
		if(single==null)
		{
			single=new ProgramCache();
		}
		return single;
	}
	
	@Override
	protected void excute()
	{
		this.clean();
		List list=null;
		try
		{
			list = ProgramUtil.list();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		if(list!=null){
			for (int i = 0; i < list.size(); i++)
			{
				SweetProgram p = (SweetProgram) list.get(i);
				this.add(p.getId(), p);
			}
		}
	}	
}

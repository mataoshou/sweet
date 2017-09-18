package tool.common;

public class StringUtils
{
	//判断string是否为有效字符串
	public static boolean isEmpty(String str)
	{
		if(str==null||str.length()==0)
		{
			return false;
		}
		return true;
	}
}

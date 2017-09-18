package tool.common;

public class Shift
{
	//获取0的字符串
	static String getZero(int length)
	{
		String str="";
		for(int i=0;i<length;i++)
		{
			str+="0";
		}
		return str;
	}
	/**
	 * 左侧补零
	 * length  返回字符串长度   
	 * s的长度超过length,返回s;小于length，左侧不足补零
	 */
	public static String leftZeroShift(String s,int length)
	{
		if(s.length()>length)
			return s;
		String str=getZero(length)+s;
		str=str.substring(str.length()-length);
		return str;
	}
	/**
	 * 右侧补零
	 * length  返回字符串长度   
	 * s的长度超过length,返回s;小于length，右侧不足补零
	 */
	public static String rightZeroShift(String s,int length)
	{
		if(s.length()>length)
			return s;
		String str=s+getZero(length);
		str=str.substring(0,length);
		return str;
	}
	public static void main(String [] args)
	{
		System.out.println(leftZeroShift("qqqfff",10));
		System.out.printf("%08\n", "qqq");
		System.out.println(rightZeroShift("qqqfff",10));
	}
}

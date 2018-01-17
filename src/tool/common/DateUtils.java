package tool.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils
{
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String dateToString(Date d)
	{
		String str = format.format(d);
		return str;
	}

	public static Date stringToDate(String str) throws ParseException
	{
		Date d = format.parse(str);
		return d;
	}

}

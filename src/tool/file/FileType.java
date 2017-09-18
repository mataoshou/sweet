package tool.file;

public class FileType
{
	public static String JPG = "JPG";
	public static String PNG = "PNG";
	public static String GIF = "GIF";
	public static String WEBP = "WEBP";
	
	//根据文件类型获取后缀
	public static String getSuffix(String type)
	{
		if(type.equals(JPG))return ".jpg";
		if(type.equals(PNG))return ".png";
		if(type.equals(GIF))return ".gif";
		if(type.equals(WEBP))return ".webp";
		return "";
	}
}

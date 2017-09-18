package business.daily.code;

public class MenuItem
{
	private String fileName;//文件名
	private String[] path;//存储路径
	private String parentName;//父类的文件名
	public String getFileName()
	{
		return fileName;
	}
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	public String[] getPath()
	{
		return path;
	}
	public void setPath(String[] path)
	{
		this.path = path;
	}
	public String getParentName()
	{
		return parentName;
	}
	public void setParentName(String parentName)
	{
		this.parentName = parentName;
	}
	
	
}

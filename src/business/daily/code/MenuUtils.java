package business.daily.code;

import java.io.File;

import tool.file.BaseFileUtil;

public class MenuUtils
{
	//获取文件路径
	public static File pathBuild(String root ,String[] path)
	{
		String child=BaseFileUtil.getFilePath(path);
		
		return new File(root,child);
	}
}

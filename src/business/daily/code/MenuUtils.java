package business.daily.code;

import java.io.File;

import tool.file.BaseFileUtil;
import tool.file.FileType;

public class MenuUtils
{
	//获取文件路径
	public static File pathBuild(String root ,String[] path)
	{
		String child=BaseFileUtil.getFilePath(path);
		if(child==null) return new File(root);
		return new File(root,child);
	}
	//获取文件类型
	public static String getFileType(File f)
	{
		if(!f.isDirectory())
		{
			return FileType.getType(BaseFileUtil.getSuffix(f));
		}
		return FileType.FOLDER;
	}
}

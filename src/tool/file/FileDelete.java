package tool.file;

import java.io.File;

import org.apache.log4j.Logger;

public class FileDelete
{
	static Logger logger =Logger.getLogger(FileDelete.class);
	/**
	 *删除文件、文件夹及下属子文件或文件夹
	 *@param file 删除的文件的路径
	 */
	public static boolean delete(File file){
		if(!file.exists()){//验证路径是否存在
			logger.debug(file.getPath()+"   路径不存在！");
			return false;
		}
		if(!file.isDirectory()){//验证是否是文件夹
			file.delete();//文件直接删除
			logger.debug("删除文件" +file.getPath());
			return true;
		}
		//遍历文件夹下的文件或文件夹，进行删除
		File[] files=file.listFiles();
		for(File f:files){
			delete(f);//递归删除
		}
		file.delete();//删除文件夹
		logger.debug("删除文件夹" +file.getPath());
		return true;
		
	}
}

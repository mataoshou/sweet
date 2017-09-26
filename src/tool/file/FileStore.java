package tool.file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStore
{
	//获取文章内容
	public static String getContent(File f,String charset) throws IOException
	{
		if(f.exists())
		{
			FileInputStream input=new FileInputStream(f);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			int n=0;
			byte[] b=new byte[1024*10];
			while(true)
			{
				n=input.read(b);
				if(n<0)break;
				out.write(b, 0, n);
			}
			return out.toString(charset);
		}
		return null;
	}
}

package sample.fileOp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import tool.common.GuidUtils;
import tool.file.BaseFileUtil;

//文件上传
public class FileUploadServlet extends HttpServlet
{
	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String root = "c:/";
		boolean isMutiply = ServletFileUpload.isMultipartContent(request);

		request.setCharacterEncoding("UTF-8");
		ServletFileUpload upload = new ServletFileUpload();
		try
		{
			FileItemIterator items = upload.getItemIterator(request);
			while (items.hasNext())
			{
				FileItemStream stream = items.next();
				String fileName = stream.getName();
				InputStream input = stream.openStream();
				if (!stream.isFormField())//获取参数
				{
					String fieldValue = Streams.asString(input, "UTF-8");
				} else
				{//获取文件
					String name = GuidUtils.guid2();
					String suffix = BaseFileUtil.getSuffix(fileName);
					File temp = new File(root, name + "." + suffix);
					System.out.println("临时存储路径：" + temp.getPath());
					FileOutputStream out = new FileOutputStream(temp);
					byte[] b = new byte[1024 * 10];
					int n = 0;
					while (true)
					{
						n = input.read(b, 0, b.length);
						if (n < 0)
							break;
						out.write(b, 0, n);
					}
					input.close();
					out.close();
				}
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

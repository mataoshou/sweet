package business;

import java.io.File;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import tool.common.DomUtil;

public class Config
{
	public static String codeRoot = "d:/";

	public static void load() throws IOException, DocumentException
	{
		String path = Config.class.getClassLoader().getResource("/Config.xml").getFile();
		File f = new File(path);
		Document xmldoc = DomUtil.getDocument(f);
		Element root = xmldoc.getRootElement();
		// 获取根目录
		codeRoot = DomUtil.child(root, "codeRoot", "");
		if (!codeRoot.endsWith("/"))
			codeRoot += "/";
	}
}

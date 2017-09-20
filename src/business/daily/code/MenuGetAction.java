package business.daily.code;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import tool.common.Convert;
import tool.common.ReplyUtils;
import tool.file.BaseFileUtil;
import tool.file.FileType;
import frame.mtfilter.MtAction;

public class MenuGetAction extends MtAction
{
	Logger logger=Logger.getLogger(getClass());
	@Override
	public String excute(String req)
	{
		logger.debug("...........MenuGetAction..............");
		int errorCode = 0;// 错误状态
		String reason = "OK";// 出错原因

		String rootPath = "d:/";//文件存储路径
		JSONObject json = JSONObject.fromObject(req);
		// 获取文件路径
		JSONArray paths = json.getJSONArray("path");
		String[] str = Convert.jsonToSArray(paths);
		List list = new ArrayList();
		JSONObject result = new JSONObject();
		try
		{
			File root = MenuUtils.pathBuild(rootPath, str);// 当前目录
			File[] fs = root.listFiles();// 子文件
			if (fs == null)
			{
				throw new Exception("文件内容为空！");
			}
			// 获取子文件数据
			for (int i = 0; i < fs.length; i++)
			{
				File f = fs[i];
				MenuItem item = new MenuItem();
				item.setFileName(f.getName());// 文件名称
				item.setFileType(MenuUtils.getFileType(f));// 文件类型

				item.setParentName(str[str.length - 1]);// 上级文件
				list.add(item);
			}
		} catch (Exception e)
		{
			return ReplyUtils.reply(-1, "文件获取失败");
		}
		result.put("items", JSONArray.fromObject(list));
		result.put("path", paths);
		
		return ReplyUtils.reply(errorCode, reason, result);
	}

	public static void main(String[] args)
	{
		MenuGetAction menu = new MenuGetAction();

		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		array.add("root");
		json.put("path", array);
		//System.out.println(json.toString());
		System.out.println(menu.excute(json.toString()));
	}
}

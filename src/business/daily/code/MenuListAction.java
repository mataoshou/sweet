package business.daily.code;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import business.Config;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import tool.common.Convert;
import tool.common.ReplyUtils;
import tool.file.BaseFileUtil;
import tool.file.FileType;
import frame.mtfilter.MtAction;

//获取文件列表
public class MenuListAction extends MtAction
{
	Logger logger = Logger.getLogger(getClass());

	@Override
	public String excute(String req)
	{
		logger.debug("...........MenuListAction..............");
		int errorCode = 0;// 错误状态
		String reason = "OK";// 出错原因

		JSONObject json = JSONObject.fromObject(req);
		// 获取文件路径
		JSONArray paths = json.getJSONArray("path");
		String[] str = Convert.jsonToSArray(paths);
		List list = new ArrayList();
		JSONObject result = new JSONObject();
		try
		{
			File root = MenuUtils.pathBuild(Config.codeRoot, str);// 当前目录
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

		return ReplyUtils.reply(errorCode, reason, result);// 构建返回结果
	}
}

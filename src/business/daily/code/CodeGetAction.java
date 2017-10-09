package business.daily.code;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import business.Config;

import tool.common.Convert;
import tool.common.ReplyUtils;
import tool.file.FileStore;

import frame.mtfilter.MtAction;

//获取文件内容
public class CodeGetAction extends MtAction
{
	Logger logger = Logger.getLogger(getClass());

	@Override
	public String excute(String content)
	{
		logger.debug("...........MenuGetAction..............");
		int errorCode = 0;// 错误状态
		String reason = "OK";// 出错原因

		JSONObject json = JSONObject.fromObject(content);
		// 获取文件路径
		JSONArray paths = json.getJSONArray("path");
		String[] str = Convert.jsonToSArray(paths);
		String name = json.getString("name");
		JSONObject result = new JSONObject();
		try
		{
			File root = MenuUtils.pathBuild(Config.codeRoot, str);// 当前目录
			File f = new File(root, name);
			if (f.exists())
			{
				String substance = FileStore.getContent(f, "UTF-8");
				result.put("content", substance);
				System.out.println(substance);
			}
		} catch (Exception e)
		{
			return ReplyUtils.reply(-1, "文件内容获取失败");
		}
		result.put("path", paths);

		return ReplyUtils.reply(errorCode, reason, result);// 构建返回结果
	}

	public static void main(String[] args)
	{
		CodeGetAction action = new CodeGetAction();
		JSONObject json = new JSONObject();
		JSONArray array = new JSONArray();
		json.put("path", array);
		json.put("name", "ProgramCache.java");
		action.excute(json.toString());
	}

}

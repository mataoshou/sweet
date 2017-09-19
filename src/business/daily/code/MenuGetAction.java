package business.daily.code;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import tool.common.Convert;
import tool.file.BaseFileUtil;
import tool.file.FileType;
import frame.mtfilter.MtAction;

public class MenuGetAction extends MtAction
{
	@Override
	public String excute(String req)
	{

		int errorCode = 0;// 错误状态
		String reason = "OK";// 出错原因

		String rootPath = "d:/";
		JSONObject json = new JSONObject();
		// 获取文件路径
		String[] str = new String[0];
		if(json.containsKey("path")){
			JSONArray paths = json.getJSONArray("path");
			str = Convert.jsonToSArray(paths);
		}
		
		File root = MenuUtils.pathBuild(rootPath, str);// 当前目录
		File[] fs = root.listFiles();// 子文件
		List list = new ArrayList();
		// 获取子文件数据
		JSONObject result = new JSONObject();
		for (int i = 0; i < fs.length; i++)
		{
			File f = fs[i];
			MenuItem item = new MenuItem();
			item.setFileName(f.getName());
			if (!f.isDirectory())
			{
				item.setFileType(FileType.getType(BaseFileUtil.getSuffix(f)));
			} else
			{
				item.setFileType(FileType.FOLDER);
			}

			if (str.length > 0)
			{
				item.setParentName(str[str.length - 1]);
			}
			list.add(item);
		}
		result.put("items", JSONArray.fromObject(list));
//		result.put("path", path);
		System.out.println(result.toString());
		JSONObject reply=new JSONObject();
		return "";
	}

	public static void main(String[] args)
	{
		MenuGetAction menu = new MenuGetAction();

		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("path", array);
		menu.excute(json.toString());
	}
}

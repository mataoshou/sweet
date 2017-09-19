package business.daily.code;

import java.io.File;

import tool.common.Convert;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import frame.mtfilter.MtAction;

public class MenuGetAction extends MtAction
{
	@Override
	public String excute(String req)
	{
		String rootPath="";
		JSONObject json=JSONObject.fromObject(req);
		JSONArray array=json.getJSONArray("path");
		String[] str=Convert.jsonToSArray(array);
		File f=MenuUtils.pathBuild(rootPath, str);
		File[] fs=f.listFiles();
		
		return "";
	}
	
	public static void main(String[] args)
	{
		MenuGetAction menu =new MenuGetAction();
		menu.excute("{}");
	}
}

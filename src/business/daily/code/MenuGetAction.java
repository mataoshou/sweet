package business.daily.code;

import net.sf.json.JSONObject;
import frame.mtfilter.MtAction;

public class MenuGetAction extends MtAction
{
	@Override
	public String excute(String req)
	{
		String rootPath="";
		JSONObject json=JSONObject.fromObject(req);
		System.out.println(json.toString());
		return "";
	}
	
	public static void main(String[] args)
	{
		MenuGetAction menu =new MenuGetAction();
		menu.excute("{}");
	}
}

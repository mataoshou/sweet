package tool.common;

import net.sf.json.JSONObject;

public class ReplyUtils
{
	//构建返回结果
	public static String reply(int code,String reason)
	{
		JSONObject json=new JSONObject();
		json.put("errorCode", code);
		json.put("reason", reason);
		return json.toString();
	}
	//构建返回结果
	public static String reply(int code,String reason,JSONObject result)
	{
		JSONObject rep=new JSONObject();
		rep.put("errorCode", code);
		rep.put("reason", reason);
		rep.put("result", result);
		return rep.toString();
	}
}

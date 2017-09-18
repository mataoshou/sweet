package frame.mtfilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class MtAction
{
	public HttpServletRequest request;
	public HttpServletResponse response;
	public HttpSession session;
	
	public boolean init(HttpServletRequest req, HttpServletResponse res)
	{
		request=req;
		response=res;
		session=request.getSession();
		return true;
	}
	
	public abstract String excute(String content);

}

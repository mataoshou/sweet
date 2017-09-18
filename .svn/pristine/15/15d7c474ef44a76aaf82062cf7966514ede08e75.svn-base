package frame.sys;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StartSys implements Filter
{
	Logger logger=Logger.getLogger(StartSys.class);
	@Override
	public void destroy()
	{
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException
	{
		
	}

	@Override 
	public void init(FilterConfig arg0) throws ServletException
	{
		logger.debug(".........初始化系统............");
		//启动系统任务
		TaskUtil.startTask();
	}
	
}

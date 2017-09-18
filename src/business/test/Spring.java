package business.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring
{
	public static void main(String[] args)
	{
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
	}
}

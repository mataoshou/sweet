package frame.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class SpringBeanFactory implements BeanFactoryAware
{
	private static BeanFactory beanFactory = null;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException
	{
		SpringBeanFactory.beanFactory = beanFactory;
	}

	public static BeanFactory getBeanFactory()
	{
		return beanFactory;
	}

	public static Object getBean(String name)
	{
		return beanFactory.getBean(name);
	}

}

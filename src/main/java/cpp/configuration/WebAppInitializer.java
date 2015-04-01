package cpp.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
  
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class<?>[] { DispatcherConfig.class };
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[] { "/" };
	}
	
	
	@Override
	protected void customizeRegistration( javax.servlet.ServletRegistration.Dynamic registration) 
	{
		registration.setAsyncSupported( true);
	}
 
}

package cpp.configuration;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import cpp.service.EventService;
import cpp.service.EventServiceImplement;
  
@Configuration 
@ComponentScan("cpp") 
@EnableWebMvc   
public class DispatcherConfig 
{  
	@Bean  
    public InternalResourceViewResolver setupViewResolver() 
	{  
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        
        return resolver;  
    }
	
	
	@Bean  
    public EventService eventservice()
	{  
        return new EventServiceImplement();  
    }
}  
 
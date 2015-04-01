package cpp.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




import cpp.service.EventService;

@Controller

public class ViewController  implements Observer 
{
	private static final String PAGE_VIEW = "view" ;
	
	@Autowired
	private EventService eventservice;
	
	
	
	@RequestMapping("/view")
    public String hello() 
	{
            return   PAGE_VIEW ;
		
	}
	
	
			
	@RequestMapping( value = "/statistics",method = RequestMethod.POST ) 
	
	public  @ResponseBody Map<Object,Object> statistics( @RequestParam(value="now", required=false) String now,
							 Model model,
		    				 HttpServletRequest request, 
		    				 HttpServletResponse response
		    				)
	{
		String charset =  "utf-8"  ;
		response.setCharacterEncoding( charset);
		
	 
			
			Map<Object,Object> map = new HashMap<Object,Object>(); 
			map.put("now", now) ;
			
			return map ;
		
	}



	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
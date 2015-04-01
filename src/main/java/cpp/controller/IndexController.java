package cpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cpp.service.EventService;

@Controller
public class IndexController 
{
	private static final String PAGE_INDEX = "index" ;
	
	@Autowired
	private EventService eventservice;
	 
	
	@RequestMapping("/index")
	public String index( )
	{
		return PAGE_INDEX ;
	}
	
	@RequestMapping("/submit")
    public String hello(@RequestParam(value="account", required=false) String account,
    		@RequestParam(value="location", required=false) String location,
    		Model model) 
	{
		
			
			eventservice.insert ( new cpp.entity.UserBean( account,null,location)) ;
			
	        model.addAttribute("account" ,  account+"\tsuccess");
	        model.addAttribute("location",  location);
	         
            return PAGE_INDEX ;
	}
}
package cpp.service;

import org.springframework.stereotype.Service;

@Service

public class EventServiceImplement implements EventService 
{
	
	public cpp.entity.UserBean insert ( cpp.entity.UserBean foo)
	{
		return  foo;
	}
}

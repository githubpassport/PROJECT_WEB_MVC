package cpp.entity;

import java.util.Observable;

public class UserBean extends Observable  
{
	private String account ;
	private String password;
	
	private String location;
	
	public UserBean() { }
	
	public UserBean( String account,String password,String location)
	{
		this.account  = account ;
		this.password = password ;
		this.location = location ;
		
	     setChanged();  
	     notifyObservers();  
	}
	
	
	

	public String getAccount() 
	{
		return account;
	}

	public void setAccount(String account) 
	{
		this.account = account;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	
	
}


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
		<title>Spring MVC</title>
		
		<script src='http://code.jquery.com/jquery-1.11.2.js'></script>
		<script >
		
	        $(function () {
	        	
	
	            
	            (function longpolling() {
	            
	                $.ajax({
	                    url: "statistics",
	                    data: {now: new Date().getTime()},
	                    type: "POST",
	                    dataType: "json",
	                    timeout: 5000,
	                    error: function (XMLHttpRequest, textStatus, errorThrown) 
	                    {
	                        $("#state").html("[state: " + textStatus + ", error: " + errorThrown + " ]<br/>");
	                        if (textStatus == "timeout")  // 请求超时
	                                longpolling(); // 递归调用
	                            
	                        // 其他错误，如网络错误等   
	                         else  
	                        // TODO:
	                        		 ;
	                            
	                    },
	                    success: function (data, textStatus) 
	                    {
	                        $("#state").html("[state: " + textStatus + ", data: { " + data + "} ]<br/>");
	                        
	                        if (textStatus == "success")  // 请求成功
	                            longpolling();
	                         
	                    }
	                });
	            })();
	            
	        });
			
		
		</script>
	</head>
	
	<body>
		<p id='state'></p>
	</body>
</html>
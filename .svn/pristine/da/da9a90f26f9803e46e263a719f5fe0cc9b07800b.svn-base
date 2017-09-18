<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'scroll.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	
	</style>
	
	<script type="text/javascript" src="js/jquery.js"></script>
  </head>
  	
  <body>
  	<script>
  		var cur=0;
  		var Scroll={};
  		Scroll.left=function(that)
  		{
  			var img=$(that);
  			
  			/*img.animate({marginLeft:"200px",width:"200px"},1000,function()
  			{
  				img.animate({marginLeft:"400px",width:"100px"},1000);
  			});*/
  			
  			img.animate({width:"400px",heigth:"100px"},1000,function()
  			{
  				//img.animate({marginLeft:"400px",width:"100px"},1000);
  			});
  			//img.css("-webkit-transform","skewX(20deg)");
  		}
  		
  	</script>
    <div style="height:600px;width:400px;">
    	<img onclick="Scroll.left(this)" style="width:100px;max-heigth:100px;" src="image/1.jpg"/>
    </div>
  </body>
</html>

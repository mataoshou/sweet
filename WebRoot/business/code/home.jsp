<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="plugin/jquery-ui/jquery-ui.js"></script>
	<script type="text/javascript" src="plugin/jquery-ui/jquery-ui.css"></script>
  </head>
  <script type="text/javascript">
  	$(function() {
    	$( "#draggable" ).draggable();
	});
  </script>
  <body>
  <div style="background:linear-gradient(#1b1b1b, #000);height:40px;border-bottom:2px solid  #FAA523;"></div>
  <div style="background:#B24926;height:calc(100% - 50px);"></div>
    <!-- <div id="draggable" class="ui-widget-content">
	  <p>Drag me around</p> 
	</div>-->
  </body>
</html>

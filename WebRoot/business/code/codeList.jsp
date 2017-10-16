<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'codeList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="plugin/bootstrap-3.3.7/css/bootstrap.min.css " type="text/css" />
	
	
	<style type="text/css">
		.head{
			height:150px;
			background:#aaa;
		}
		.middle{
			height:150px;
			background:#bbb;
		}
		.left{
			
		}
		.right{
			
		}
		.bottom{
			height:150px;
			background:#ccc;
		}
	</style>
  </head>
  <body>
    <div style="height:700px;background:#ddd;">
    	<div class="head"></div>
    	<div class="container-fluid middle">
    		<div class="row">
    			<div class="col-md-2 menu">
					<div class="menu-title"></div>
					<div class="menu-item-contain"></div>
				</div>
    			<div class="col-md-8 content">222222222</div>
    		</div>
    	</div>
    	<div class="bottom"></div>
    </div>
  </body>
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="plugin/bootstrap-3.3.7/js/bootstrap.js"></script>
</html>

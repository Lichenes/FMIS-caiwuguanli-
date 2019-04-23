<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.smaller-image{
	   width: 5%;
	}
.btn1{
	  text-align: left;
	}
</style>
</head>
<body>
<div align="right">
<%if(session.getAttribute("username")==null){%>
	<a href="login.html" title="请登录"><img alt="请登录" src="image/2.png" class="smaller-image btn1"></a>
<%} else{%>
	<a href="data.jsp" title="个人中心"><img alt="已登录" src="image/3.png" class="smaller-image btn1"></a>
<%}%>
</div>
</body>
</html>
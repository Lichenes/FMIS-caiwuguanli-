<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	background-color: #eee !important;
	font-family: '微软雅黑',"宋体","Arial Narrow",Helvetica,sans-serif;
	text-align: center;
}
</style>
<%
	String name = request.getParameter("username");
	String password = request.getParameter("password");
	String password2 = request.getParameter("password2");
	%>
<title>跳转中</title>
</head>
<body>
<%if(name!=null&&password.equals(password2)){ %>
	<h1>注册成功!</h1>
账号:<%=name %><br>
密码:<%=password %>
<%response.setHeader("Refresh","3;URL=login.html");%> 
<%}else{ %>
	<h2>注册失败!请重新注册....</h2>
	<%response.setHeader("Refresh","3;URL=register.html");%> 
	<%} %>
</body>
</html>
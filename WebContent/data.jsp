<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	background-color:#eee !important;
	font-family: '微软雅黑',"宋体","Arial Narrow",Helvetica,sans-serif;
	text-align: center;
}
</style>
<title>个人中心</title>
</head>
<body>
	<h1>个人资料</h1>
	<p>账号:<%=session.getAttribute("username") %></p>
	<p>密码:<%=session.getAttribute("password") %></p><br>
	<a href="logout.jsp">注销</a>
</body>
</html>
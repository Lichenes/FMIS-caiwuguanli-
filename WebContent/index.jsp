<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">
<meta http-equiv="refresh" content="1">
<style type="text/css">
body {
	background-color: orange;
	font-family: verdana;
	font-size: 30px;
	text-align: center;
}
</style>
    <title>用户注册和登录系统</title>
</head>
<body>
<pre>
<a href="login.html" title="用户登录"><i>login</i></a> <a href="register.html" title="新用户注册"><em>register</em></a>
</pre>
<% String today=new Date().toLocaleString(); %>
今天是：<%= today %>
</body>
</html>

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
	font-family: '微软雅黑',"宋体","Arial Narrow",Helvetica,sans-serif;
}
.smaller-image{
   width: 40px;
}
.btn1{
  float: right;
}
</style>
    <title>用户注册和登录系统</title>
</head>
<body>
<form style="text-align: center;">
<a href="login.html" title="请登录"><img alt="请登录" src="image/2.png" class="smaller-image btn1"></a>
</form>
<% String today=new Date().toLocaleString(); %>
今天是：<%= today %>
</body>
</html>

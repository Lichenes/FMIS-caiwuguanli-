<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/message.css" >
<% 
	String error = (String) request.getAttribute("info");
	if (error == null) {
		error="请输入用户名和密码";
	}
%>
		<title>用户登录</title>
</head>
<body>
<div>
<form action="User" id="login" method="post" class="form-sigin" >
<input type="hidden" name="oper" value="Login">
<h2 class="form-sigin-heading">欢迎登录</h2>
<div style="text-align: center;">
<input type="text" class="form-control" id="a" name="username" placeholder="用户名" autocomplete="on"><br>
<input type="password" class="form-control" id="b" name="password" placeholder="密码"><br>
<span class="error" style="color: #ff0000"><%=error %></span><br>
<button class="btn" type="submit" name="submit">登录</button><br><br>
<a href="register.jsp"><font size="3"><i>没有帐号？点击注册</i></font></a><br><br>
<a href="pwd.jsp"><font size="3"><i>忘记密码</i></font></a>
</div>
</form>
</div>
</body>
</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
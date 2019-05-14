<%@page import="com.ltw.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">
<link rel="stylesheet" type="text/css" href="css/index.css" >
    <title>财务管理系统</title>
</head>
<body>
<div id="header">
<%@ include file="welcome.jsp" %>
<div class="key">
<p>财务管理
</div>
</div>
<div id="nav">
<%@ include file="left.jsp" %>
</div>
<div id="section">
<div style="padding-left: 50%; padding-top: 10%;">
<h1 style="padding-left: 20%;">修改密码</h1>
<form action="User" id="newpwd" method="post" style="padding-left: 5%;" onsubmit="return check();" target="_top">
<input type="hidden" name="oper" value="Newpwd">
<pre>
新密码:       <input type="password"  id="a" name="newpwd" placeholder="字母开头，长度在6~18之间" pattern="^[a-zA-Z]\w{5,17}$"><br>
确认密码:     <input type="password"  id="b" placeholder="请再次输入密码" pattern="^[a-zA-Z]\w{5,17}$"><br>
                      <button type="submit" name="submit">确认</button><br>
</pre>
</form>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
	function check(){
		var a=document.getElementById("a").value;
		var b=document.getElementById("b").value;
	if(a!=b)
	{
		alert("输入密码不一致，请重新输入!");
		b.value="";
		return false;
	}
}
</script>
</html>

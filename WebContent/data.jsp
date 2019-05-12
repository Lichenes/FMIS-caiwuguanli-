<%@page import="com.ltw.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">
<link rel="stylesheet" type="text/css" href="css/index.css" >
<%
	String Pwd=((User)session.getAttribute("user")).getPassword();
	String Sex=((User)session.getAttribute("user")).getSex();
	int Age=((User)session.getAttribute("user")).getAge();
	String Brith=((User)session.getAttribute("user")).getBrith();
%>
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
<div style="padding-left: 65%; padding-top: 10%;">
<h1 style="padding-left: 10%;">个人信息</h1>
<table>
<tr>
<td>账号:</td>
<td><%=User %></td>
</tr>
<tr>
<td>密码:</td>
<td><%=Pwd %></td>
</tr>
<tr>
<td>性别:</td>
<%if("1".equals(Sex)){ %>
<td>男</td>
<%}else{ %>
<td>女</td>
<%} %>
</tr>
<tr>
<td>年龄:</td>
<td><%=Age %></td>
</tr>
<tr>
<td>出生年月:</td>
<td><%=Brith %></td>
</tr>
</table>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
	function out() {
		if(window.confirm("你確定退出此账号?")){
			submit();
		}
	}
</script>
</html>

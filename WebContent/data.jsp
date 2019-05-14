<%@page import="com.ltw.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">
<link rel="stylesheet" type="text/css" href="css/index.css" >
<%
	String Sex=((User)session.getAttribute("user")).getSex();
	int Age=((User)session.getAttribute("user")).getAge();
	String Cardid=((User)session.getAttribute("user")).getCardid();
	int Money=((User)session.getAttribute("user")).getMoney();
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
<div style="padding-left: 50%; padding-top: 10%;">
<h1 style="padding-left: 5%;">个人信息</h1>
<table>
<tr>
<td>账号:</td>
<td><%=User %></td>
</tr>
<tr>
<td>年龄:</td>
<td><%=Age %></td>
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
<td>银行卡号:</td>
<%if(Cardid==null){ %>
<td></td>
<%}else{ %>
<td><%=Cardid %></td>
<%} %>
</tr>
<tr>
<td>余额:</td>
<td><%=Money %></td>
</tr>
</table>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
</html>

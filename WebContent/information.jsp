<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">
<link rel="stylesheet" type="text/css" href="css/index.css" >
<% 
	String error = (String) request.getAttribute("info");
	if (error == null) {
		error=" ";
	}
%>

    <title>完善个人信息</title>
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
<form action="Account" style="padding-left: 50%; padding-top: 10%;">
<input type="hidden" name="oper" value="Ifm">
<span class="error" style="color: #ff0000; padding-left: 10%;"><%=error %></span>
	<h1 style="padding-left: 10%;">完善个人信息</h1>
<table>
<tr>
<td>银行卡号:</td>
<td><input type="text" required="required" name="cardid"></td>
</tr>
<tr>
<td>持卡人:</td>
<td><input type="text" required="required" name="name"></td>
</tr>
<tr>
<td>银行卡余额:</td>
<td><input type="text" name="money"></td>
</tr>
<tr>
<td>年龄:</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>性别:</td>
<td>
	男:<input type="radio"  name="sex" value="1" checked="checked">
	女:<input type="radio"  name="sex" value="0" >
</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" name="submit" value="添加"></td>
</tr>
</table>
</form>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
	function show() {
		alert("<%=error %>");
	}
</script>
</html>

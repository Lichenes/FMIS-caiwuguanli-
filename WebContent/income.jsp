<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ltw.pojo.User"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<style type="text/css">
table{
	width: 100%;
	height: 10%;
}
.aa{
	overflow: auto;
}

 .white_content { 
            display: none;
            position: absolute;  
            margin-top:5%;
            margin-left:40%;
            width: 30%; 
            height: 50%;  
            border: 10px solid orange; 
            background-color: white; 
            z-index:1002; 
            overflow: auto;
        } 
</style>
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
<div id="light" class="white_content">
	<h2 align="center">添加收入表单</h2>
<form action="Account" method="post" style="font-size: 20px; text-align: center;">
<input type="hidden" name="oper" value="Income">
收入人:&emsp;&emsp;&emsp;<input type="text" name="name" required="required"><br>
收入类型:&emsp;&emsp;<input type="text" name="income" list="income" required="required"><br>
收入金额:&emsp;&emsp;<input type="text" name="money" required="required"><br>
收入时间:&emsp;&emsp;<input type="text" name="date"  value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>"/><br>
备忘录:&emsp;&emsp;&emsp;<textarea  cols="22" rows="3" style="overflow: auto;" name="notebook"></textarea><br>
<button type="submit" name="submit" onclick="pop1()">添加</button>&emsp;<button type="button" onclick="pop1()">返回</button>
<datalist id="income">
	<option>固定工资</option>
	<option>奖金</option>
	<option>其他收入</option>
</datalist>
</form>
</div>
<div id="fade">
用户管理<span style="color: #ff0000"><%=error %></span><a href="javascript:void(0)" onclick="pop()" style="padding-left: 50%;">添加收入账单</a>&emsp;&emsp;<a href="Search?oper=Income">刷新</a>
<div class="aa">
<table border="1">
<tr>
<th>收入人</th><th>收入类型</th><th>收入金额</th><th>收入时间</th><th>备注</th>
</tr>
<%
	List<User> lu=(ArrayList<User>)request.getAttribute("lu");
	for(User u:lu){
%>
<tr>
<td><%=u.getName() %></td>
<td><%=u.getType() %></td>
<td><%=u.getIncome() %></td>
<td><%=u.getDate() %></td>
<td><%=u.getNotebook() %></td>
</tr>
<%} %>
</table>
</div>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
 function pop() {
	 document.getElementById('light').style.display='block';
	 document.getElementById('fade').style.display='none';
}
 function pop1() {
	 document.getElementById('light').style.display='none';
	 document.getElementById('fade').style.display='block';
}
</script>
</html>

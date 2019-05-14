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
 .white_content { 
            display: none; 
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
<div>
用户管理<a href="javascript:void(0)" onclick="pop()" style="padding-left: 65%;">添加收入账单</a>
<div id="light" class="white_content">
	<h2 align="center">添加收入表单</h2>
<form action="Account" method="post" style="font-size: 20px; text-align: center;">
<input type="hidden" name="oper" value="Income">
收入人:&emsp;&emsp;&emsp;<input type="text" name="name" required="required"><br>
收入类型:&emsp;&emsp;<input type="text" name="income" list="income" required="required"><br>
收入金额:&emsp;&emsp;<input type="text" name="money" required="required"><br>
收入时间:&emsp;&emsp;<input type="text" name="date"  value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>"/><br>
备忘录:&emsp;&emsp;&emsp;<textarea  cols="22" rows="3" style="overflow: auto;" name="notebook"></textarea><br>
<button type="submit" name="submit" onclick="pop1()">添加</button>&emsp;<button type="submit" onclick="pop1()">返回</button>
<datalist id="income">
	<option>固定工资</option>
	<option>奖金</option>
	<option>其他收入</option>
</datalist>
</form>
</div>
<span class="error" style="color: #ff0000"><%=error %></span><br>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
 function pop() {
	 document.getElementById('light').style.display='block';
}
 function pop1() {
	 document.getElementById('light').style.display='none';
}
</script>
</html>

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
<table id="table">
<tr>
<td><a href="index.jsp">主页</a></td>
</tr>
<tr>
<td><a href="#">收入</a></td>
</tr>
<tr>
<td><a href="#">支出</a></td>
</tr>
<tr>
<td><a href="data.jsp">信息管理</a></td>
</tr>
</table>
</div>
<div id="section">
<div style="padding-left: 65%; padding-top: 10%;">
<h1 style="padding-left: 25%;">个人信息</h1>
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
	<!--
	<a href="logout.jsp">退出</a>  //jsp注销session
	 -->
<form action="User" id="Out" method="post" style="padding-left: 40%;">
	<input type="hidden" name="oper" value="Out">
	<input type="submit" value="退出" onclick="out();return false;">
</form>
<a href="newpwd.jsp"><button type="button" style="margin-left: 37%;">修改密码</button> </a>
</div>
</div>
<div id="footer">
<%@ include file="footer.jsp" %>
</div>
</body>
<script type="text/javascript">
	var trs = document.getElementById('table').getElementsByTagName('tr');
	window.onload = function(){
	 for( var i=0; i<trs.length; i++ ){
	  trs[i].onmousedown = function(){
 	  tronmousedown(this);
  	}
  }
}
	function tronmousedown(obj){
	 for( var o=0; o<trs.length; o++ ){
	  if( trs[o] == obj ){
 	  trs[o].style.backgroundColor = '#DEEEFF';
 	 } else{
  		 trs[o].style.backgroundColor ='';
  	}
 }
}
	function out() {
		if(window.confirm("你確定退出此账号?")){
			submit();
		}
	}
</script>
</html>

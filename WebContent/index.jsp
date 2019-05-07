<%@page import="java.util.Date"%>
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

</script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="3;url=index.jsp">
<style type="text/css">
body {
	background-color: #eee !important;
	font-family: '微软雅黑',"宋体","Arial Narrow",Helvetica,sans-serif;
	text-align: center;
}
</style>
<%
	session.invalidate();
%>
<title>跳转中</title>
</head>
<body>
<h1>注销成功!</h1>
<p><span id="spanid">3</span>秒之后跳转</p>
</body>
<script type="text/javascript">
var time=2;
function loadTime(){
var span = document.getElementById("spanid");
span.innerHTML=time--;
}
setInterval("loadTime()", "1000");
 </script>
</html>
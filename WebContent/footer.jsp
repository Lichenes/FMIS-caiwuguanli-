<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>
</head>
<body>
 <div id="currentTime"></div>
</body>
<script language="javascript">     
   var currentDate = new Date(<%=new java.util.Date().getTime()%>);   
   function run() {       
   currentDate.setSeconds(currentDate.getSeconds()+1);
   document.getElementById("currentTime").innerHTML = currentDate.toLocaleString();
   }
   window.setInterval("run();", 1000); 
 </script>
</html>
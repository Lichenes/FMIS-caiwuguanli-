<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/message.css" >
		<title>新用户注册</title>
</head>
<body>
<div class="wrapper">
<form action="User" method="post" class="form-sigin" >
<input type="hidden" name="oper" value="Reister">
<h2 class="form-sigin-heading">注册信息</h2>
<div style="text-align: left;">
<pre>
账号:         <input type="text" class="form-control" id="a" name="username" autocomplete="off" placeholder="7个汉字或14个字符" pattern="^[\u4e00-\u9fa5]{1,7}$|^[\dA-Za-z_]{1,14}$"><br>
密码:         <input type="password" class="form-control" id="b" name="password" placeholder="字母开头，长度在6~18之间" pattern="^[a-zA-Z]\w{5,17}$"><br>
确认密码:     <input type="password" class="form-control" id="c" placeholder="请再次输入密码" pattern="^[a-zA-Z]\w{5,17}$" onkeyup="check()"><br>
             <span id="tips"></span>
              <button class="btn" type="submit" name="submit">注册</button><br>
</pre>
</div>
</form>
</div>
</body>
<script type="text/javascript">
	function check(){
		var b=document.getElementById("b").value;
		var c=document.getElementById("c").value;
	if(b!=c)
	{
		document.getElementById("tips").innerHTML="两次密码的输入不一致";
	}else{
		document.getElementById("tips").innerHTML="   ";
	}
}
</script>
</html>
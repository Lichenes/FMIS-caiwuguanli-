<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/message.css" >
		<title>修改密码</title>
</head>
<body>
<div class="wrapper">
<form action="User" method="post" class="form-sigin" >
<input type="hidden" name="oper" value="">
<h2 class="form-sigin-heading">修改密码</h2>
<div style="text-align: left;">
<pre style="font-size:15px;">
账号:         <input type="text" class="form-control" id="a" name="username" autocomplete="off" placeholder="7个汉字或14个字符" pattern="^[\u4e00-\u9fa5]{1,7}$|^[\dA-Za-z_]{1,14}$"><br>
新密码:       <input type="password" class="form-control" id="a" name="newpwd" placeholder="字母开头，长度在6~18之间" pattern="^[a-zA-Z]\w{5,17}$"><br>
确认密码:     <input type="password" class="form-control" id="b" placeholder="请再次输入密码" pattern="^[a-zA-Z]\w{5,17}$" onkeyup="check()"><br>
             <span id="tips"></span>
              <button class="btn" type="submit" name="submit">确认</button><br>
</pre>
</div>
</form>
</div>
</body>
<script type="text/javascript">
	function check(){
		var b=document.getElementById("a").value;
		var c=document.getElementById("b").value;
	if(b!=c)
	{
		document.getElementById("tips").innerHTML="两次密码的输入不一致";
	}else{
		document.getElementById("tips").innerHTML="   ";
	}
}
</script>
</script>
</html>
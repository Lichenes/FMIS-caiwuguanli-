<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.show{
	cursor: pointer;
	font-size: 30px;
	
}
ul{
	display: none;
}
li{
	list-style: none;
}
a{
	text-decoration: none;
	font-size: 20px;
}
</style>
</head>
<body>
<div class="show" onclick="isHidden('div1')">主页</div>
<ul id="div1">
<li><a href="index.jsp">主页</a></li>
</ul>
<div class="show" onclick="isHidden('div2')">费用明细</div>
<ul id="div2">
<li><a href="Search?oper=Income">收入</a></li>
<li><a href="Search?oper=Consume">支出</a></li>
</ul>
<div class="show" onclick="isHidden('div3')">信息管理</div>
<ul id="div3">
<li><a href="Account?oper=refresh">个人信息</a></li>
<li><a href="information.jsp">完善信息</a></li>
<li><a href="newpwd.jsp">修改密码</a></li>
<li><a href="User?oper=Out" onclick="out();return false;">退出</a></li>
</ul>
</body>
<script type="text/javascript">
  function isHidden(oDiv){
	      var vDiv = document.getElementById(oDiv);
	      vDiv.style.display = (vDiv.style.display == 'none')?'block':'none';
	    }
	function out() {
		if(window.confirm("你確定退出此账号?")){
			submit();
		}
	}
</script>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>partner-login</title>
</head>
<h1>login</h1>
<body>
	<form action="HomePage.do" name="tologin" method="post" >
	 	<fieldset>
	 		<legend>欢迎登录</legend>
	 		用户账号：<input type="text" id="personalAccount" name="personalAccount" placeholder="请输入用户账号">
	 		用户密码：<input type="password" id="personalPassword" name="personalPassword" placeholder="请输入用户密码">
	 		<input type="submit"  name="submit" value="登录">
	 	</fieldset>
	 </form>
</body>
</html>
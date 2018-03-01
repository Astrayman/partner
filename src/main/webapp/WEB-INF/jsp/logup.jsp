<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
logup
	<form action="/toHomePage.do" name="tologup" method="post">
		<fieldset>
			<legend>请注册</legend>
			请输入用户账号：<input type="text" id="personalAccount" name="personalAccount" placeholder="请输入用户账号" >
			请输入用户密码：<input type="password" id="personalPassword" name="personalPassword" placeholder="请输入用户密码">
			请输入您的姓名：<input type="text" id="personalUserName" name="personalUserName" placeholder="请输入您的姓名" >
			请输入您的专业：<input type="text" id="specialty" name="specialty" placeholder="请输入你的专业" >
			请输入联系方式：<input type="text" id="contactInfor" name="contactInfor" placeholder="请输入联系方式" >
			请选择您的性别：<input type="radio" id="sex" name="sex" value="male" >
					   <input type="radio" id="sex" name="sex" value="female">
					   <input type="radio" id="sex" name="sex" value="serecy" checked="checked">
			<!-- 以后再加个图片识别 -->
			<input type="submit" id="tologup" name="tologup" value="注册" >
			<input type="submit" id="toexit" name="toexit" value="退出">
 			
		</fieldset>
		
	</form>
</body>
</html>
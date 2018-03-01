<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Partner</title>
</head>
<body>
	 <h1>homepage</h1>
	 <hr/>
	 应该写个页面头部，每个页面都要判断客户是否已经登录，从而确定是否要显示注册登录和用户信息
	 <a href="/login.do" >登录</a>
	 <a href="/logup.jsp">注册</a>
	 <hr/>
	 <form action="/searcher.do" method="post" >
	 <input type="file" name="file">
	 <input type="text" name="sercherText" id="sercherText">
	 <input type="submit" name="sercherSubmit" id="sercherSubmit" value="搜索">
	 </form>
</body>
</html>
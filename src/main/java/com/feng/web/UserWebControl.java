package com.feng.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feng.service.HomePage.LogInService;

@Controller
public class UserWebControl
{
	public UserWebControl() {}
	
	private LogInService logInService;
	
	@Autowired
	public void setLogIn(LogInService logInService)
	{
		this.logInService = logInService;
	}
	
	@RequestMapping(value="/welcome.do")
	public String welcomepage()
	{
		return "welcome";
	}
	
	@RequestMapping(value="/login.do" ,method=RequestMethod.POST)
	public String  loginCheck(HttpServletRequest request)
	{
		//判断是否有这个账号
		boolean hasUserAccount = false;
		//在判断了密码也匹配的情况下通行
		boolean loginOk = false;
		//接受网页请求发送的数据
		String personalAccount = request.getParameter("personalAccount");
		String personalPassword = request.getParameter("personalPassword");
		//调用service层查找匹配信息
		if( personalPassword != "" && personalAccount != "")
		{
			loginOk = logInService.matchUser(personalAccount, personalPassword);			
		}
		//这里应该保留用户当前浏览的页面，后期还要判断
		if(hasUserAccount && loginOk)
		{
			//暂时用homepage界面用下
			return "HomePage";
		}
		//后期可以加个对账号的确认，及账号正确密码错误
		else 
		{
			System.out.println("用户名或密码错误，或者请注册新的账号");
			return "logup";
		}
			
	}
	
	@RequestMapping(value="/logup.do")
	public String LogUp()
	{
		return "logup";
	}
	
	
	
}

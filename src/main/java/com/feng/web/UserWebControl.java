package com.feng.web;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*
	 * 此处应该跳转到homepage，可以提供服务浏览
	 */
	@RequestMapping(value="/welcome.do")
	public String welcomepage(HttpServletRequest request)
	{
		//显示具体路径
		String path = request.getServletContext().getRealPath(null);
		System.out.println(path);
		return "HomePage";
	}
	@RequestMapping(value="/login.do")
	private String tologinpage()
	{
		return "login";

	}
	
	/*
	//因为modelattribu注解会第一个调用，所以在多个请求方法的类中要慎用；
	@ModelAttribute
	//通过注解可以得到请求的模型
	public void setLoginCheckModel(String personalAccount,String personalPassword)
	{
		//将请求的相关参数赋值给loginPersonInfor对象
		loginPersonInfor.setPersonalAccount(personalAccount);
		loginPersonInfor.setPersonalPassword(personalPassword);
		//因为loginPersonInfor是外部变量所以就不需要通过model来传递了
		//loginMmodel.addAttribute("loginPersonInfor", loginPersonInfor);
	}
	*/	
	
	/*
	 * 	login表单跳转应该到客户浏览的当前页面。此处用homepage暂时测试下
	 * 	以后再改
	 */
	@RequestMapping(value="/HomePage.do" ,method=RequestMethod.POST)
	public String  loginCheck(
			//使用requestparam注解得到请求的参数
			  @RequestParam(value="personalAccount",required=true) int personalAccount
			, @RequestParam(value="personalPassword",required=true) int personalPassword
			)
	{
		//在判断账户匹配的情况
		boolean loginOk = false;
		
		//调用service层查找匹配信息
		if( personalPassword != 0 && personalAccount != 0)
		{
			
			System.out.println("输入有效"+personalAccount + "  " + personalPassword);
			loginOk = logInService.matchUser(personalAccount, personalPassword);			
		}
		//这里应该保留用户当前浏览的页面，后期还要判断
		if(loginOk)
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
	
	//logup表单提交应该跳转到homepage
	@RequestMapping(value="/toHomePage.do",method=RequestMethod.POST)
	public String LogUp(
				@RequestParam(value="personalAccount",required=true)int personalAccount
			,	@RequestParam(value="personalPassword",required=true)int personalPassword
			,	@RequestParam(value="personalUserName",required=true,defaultValue="")String personalUserName
			,	@RequestParam(value="specialty",required=true,defaultValue="")String specialty
			,	@RequestParam(value="contactInfor",required=true,defaultValue="")String contactInfor
			,	@RequestParam(value="sex",required=false,defaultValue="secrecy")String sex)
	{
		//判断是否有这个账号
		boolean hasUserAccount = false;
		hasUserAccount = logInService.hasMatchedAccount(personalAccount);
		if(hasUserAccount)
		{
			System.out.println("用户名已经存在");
			return "logup";
		}
		//判断非空
		else if (personalAccount == 0 || personalPassword == 0 || personalUserName =="" || 
				specialty =="" || contactInfor =="")
		{
			return "logup";
		}
		else {
			return "HomePage";
		}	
		
	}
	
	@RequestMapping(value="/searcher.do")
	public String toSercher(
				@RequestParam(value="sercherText",defaultValue="")String searcherText
			)
	{
		if(searcherText!="")
		{
			System.out.println("搜索结果！");
			return "searcher";
		}
		else
		{
			return "searcher";
		}
		
	}
	
	@RequestMapping(value="/moreSearcher.do")
	//是否加些参数条件，来让方法复用，来显示更多项目和人的信息
	public String toMoreSercher()
	{
		//调用排序service
		System.out.println("按条件显示更多结果");
		return "searcher";
	}
	


}

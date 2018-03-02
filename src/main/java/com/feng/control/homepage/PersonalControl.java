package com.feng.control.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feng.services.personalInterfaces.PersonalService;

@Controller
public class PersonalControl
{
	@Autowired
	@Qualifier("personalService")
	//定义一个接口对象，用service("personalService")来实例化
	private PersonalService personalService;
	@RequestMapping("/welcome.do")
	public String showPersonal()
	{
		System.out.println(personalService.getPersonalInfor().getPersonalAccount());
		System.out.println("我去~"+personalService.getPersonalInfor().getPersonalAccount());
		System.out.println();
		return "HomePage";
	}
	
	
}

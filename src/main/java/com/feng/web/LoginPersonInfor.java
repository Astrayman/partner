package com.feng.web;

import org.springframework.stereotype.Controller;

@Controller
public class LoginPersonInfor
{
	private String personalAccount;
	private String personalPassword;
	
	public LoginPersonInfor() {}

	public String getPersonalAccount()
	{
		return personalAccount;
	}

	public void setPersonalAccount(String personalAccount)
	{
		this.personalAccount = personalAccount;
	}

	public String getPersonalPassword()
	{
		return personalPassword;
	}

	public void setPersonalPassword(String personalPassword)
	{
		this.personalPassword = personalPassword;
	}
	
	

}

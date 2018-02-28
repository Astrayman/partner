package com.feng.domain;

import java.io.Serializable;

//个人信息映射模型
public class PersonalInfoMapping implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String personalAccount; //账号
	private String personalPassword; //密码
	private String personalNumber;	//编号
	
	public PersonalInfoMapping() {}

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

	public String getPersonalNumber()
	{
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber)
	{
		this.personalNumber = personalNumber;
	}
	
	
	
}

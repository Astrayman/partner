package com.feng.domain;

import java.io.Serializable;

//个人信息映射模型
public class PersonalInfoMapping implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personalAccount; //账号
	private int personalPassword; //密码
	private String personalNumber;	//编号
	
	public PersonalInfoMapping() {}

	public int getPersonalAccount()
	{
		return personalAccount;
	}

	public void setPersonalAccount(int personalAccount)
	{
		this.personalAccount = personalAccount;
	}

	public int getPersonalPassword()
	{
		return personalPassword;
	}

	public void setPersonalPassword(int personalPassword)
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

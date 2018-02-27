package com.feng.domain;

import java.io.Serializable;

public class PersonalInfoMapping implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String personalAccount;
	private String personalPassword;
	private String personalNumber;
	
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

package com.feng.domain.personalDomain;

import java.io.Serializable;

public class Personal implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int personalAccount;
	private int personalPassword;
	private int personalNumber;
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
	public int getPersonalNumber()
	{
		return personalNumber;
	}
	public void setPersonalNumber(int personalNumber)
	{
		this.personalNumber = personalNumber;
	}
	
	
}

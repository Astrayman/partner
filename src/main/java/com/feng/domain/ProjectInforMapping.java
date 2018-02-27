package com.feng.domain;

import java.io.Serializable;

public class ProjectInforMapping implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int  projectNumber;
	private String projectName;
	private String  projectCreateTime;
	private	int projectPersonsNumber;
	
	public ProjectInforMapping() {}

	public int getProjectNumber()
	{
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber)
	{
		this.projectNumber = projectNumber;
	}

	public String getProjectName()
	{
		return projectName;
	}

	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}

	public String getProjectCreateTime()
	{
		return projectCreateTime;
	}

	public void setProjectCreateTime(String projectCreateTime)
	{
		this.projectCreateTime = projectCreateTime;
	}

	public int getProjectPersonsNumber()
	{
		return projectPersonsNumber;
	}

	public void setProjectPersonsNumber(int projectPersonsNumber)
	{
		this.projectPersonsNumber = projectPersonsNumber;
	}
	
	
	
}

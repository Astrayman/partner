package com.feng.domain;

import java.io.Serializable;

public class OthersInfor implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String othersUserName; //个人姓名
	private String othersImage; //个人相片
	private int othersNumber; //个人编号
	private int participateProNum; //参与的项目编号
	private int responsibleProNum; //负责的项目编号
	private int applyProNum; //申请的项目编号
	private String specialty; //专业特长
	private String contactInfor; //联系方式
	private String resume; //个人简历
	
	public OthersInfor() {}

	public String getOthersUserName()
	{
		return othersUserName;
	}

	public void setOthersUserName(String othersUserName)
	{
		this.othersUserName = othersUserName;
	}

	public String getOthersImage()
	{
		return othersImage;
	}

	public void setOthersImage(String othersImage)
	{
		this.othersImage = othersImage;
	}

	public int getOthersNumber()
	{
		return othersNumber;
	}

	public void setOthersNumber(int othersNumber)
	{
		this.othersNumber = othersNumber;
	}

	public int getParticipateProNum()
	{
		return participateProNum;
	}

	public void setParticipateProNum(int participateProNum)
	{
		this.participateProNum = participateProNum;
	}

	public int getResponsibleProNum()
	{
		return responsibleProNum;
	}

	public void setResponsibleProNum(int responsibleProNum)
	{
		this.responsibleProNum = responsibleProNum;
	}

	public int getApplyProNum()
	{
		return applyProNum;
	}

	public void setApplyProNum(int applyProNum)
	{
		this.applyProNum = applyProNum;
	}

	public String getSpecialty()
	{
		return specialty;
	}

	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}

	public String getContactInfor()
	{
		return contactInfor;
	}

	public void setContactInfor(String contactInfor)
	{
		this.contactInfor = contactInfor;
	}

	public String getResume()
	{
		return resume;
	}

	public void setResume(String resume)
	{
		this.resume = resume;
	}
	
	
	
}

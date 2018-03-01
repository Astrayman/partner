package com.feng.dao.person;

import org.springframework.stereotype.Repository;

@Repository
//个人信息映射DAO
public class PersonalInforMappingDao 
{
	public boolean findPersonByAccountNum(int personalAccount)
	{
		boolean hasMatchPerson = true;
		System.out.println("找到匹配的人物");
		return hasMatchPerson;
	}
	public String testPersonalPassword(int personalAccount)
	{
		String password = "";
		System.out.println("密码错误");
		return password;
	}
	

}

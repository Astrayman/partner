package com.feng.dao.person;

import org.springframework.stereotype.Repository;

@Repository
//个人信息映射DAO
public class PersonalInforMappingDao 
{
	public boolean findPersonByAccountNum(String personalAccound)
	{
		boolean hasMatchPerson = true;
		System.out.println("找到匹配的人物");
		return hasMatchPerson;
	}

}

package com.feng.service.HomePage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.dao.person.PersonalInforMappingDao;

@Service
//登录
public class LogInService
{
	private PersonalInforMappingDao personalInforMappingDao;
	
	@Autowired
	public void setPersonalInfoMappingDao(PersonalInforMappingDao personalInforMappingDao )
	{
		this.personalInforMappingDao = personalInforMappingDao;
	}
	
	//提供查找匹配的用户，贡service层使用
	public boolean matchUser( int personalAccount , int personalPassword)
	{
		boolean MatchedAccount = false;
		boolean MatchedPassword = false;
		String password = "";
		//先确定有无此人
		MatchedAccount = hasMatchedAccount(personalAccount);
		
		if(MatchedAccount)
		{
			password = (personalInforMappingDao.testPersonalPassword(personalAccount));
			if(password.equals(personalPassword))
			{
				MatchedPassword = true;
				return MatchedPassword;
			}
			
		}
		return false;
		
	}
	//查找是否存在的用户
	public boolean hasMatchedAccount(int personalAccount )
	{
		return personalInforMappingDao.findPersonByAccountNum(personalAccount);
	}
}

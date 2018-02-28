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
	
	//提供查找是否存在且匹配的用户，贡service层使用
	public boolean matchUser( String personalAccount , String personalPassword)
	{
		boolean hasMatched = false;
		
		hasMatched = personalInforMappingDao.findPersonByAccountNum(personalAccount);
		
		
		
		return hasMatched;
	}
}

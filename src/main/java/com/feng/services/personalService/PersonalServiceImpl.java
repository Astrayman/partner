package com.feng.services.personalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.dao.personalDao.PersonalMapper;
import com.feng.domain.personalDomain.Personal;
import com.feng.services.personalInterfaces.PersonalService;

@Service("personalService")
public class PersonalServiceImpl implements PersonalService
{
	@Autowired
	private PersonalMapper personalMapper;
	
	
	@Override
	public Personal getPersonalInfor()
	{
		
		return personalMapper.getPersonal();
	}

}

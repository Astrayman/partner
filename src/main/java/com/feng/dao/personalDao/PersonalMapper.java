package com.feng.dao.personalDao;

import org.apache.ibatis.annotations.Select;

import com.feng.domain.personalDomain.Personal;

public interface PersonalMapper
{
	@Select(" select * from personalinformapping ")
	Personal getPersonal();
}

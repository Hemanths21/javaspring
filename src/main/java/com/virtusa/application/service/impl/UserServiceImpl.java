package com.virtusa.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.virtusa.application.dao.UserDAO;
import com.virtusa.application.model.Users;
import com.virtusa.application.service.UserService;

@Service
@Primary
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDao;
	
	@Override
	public Users getUserById(Long id, String attr) {
		// TODO Auto-generated method stub
		Users ret = new Users();
		if(attr!=null && attr.equalsIgnoreCase("fname"))
			ret.setFirst_name(userDao.retriveUserFirstName(id));
		else if(attr!=null && attr.equalsIgnoreCase("email"))
			ret.setEmail(userDao.retriveUserEmail(id));
		else
			ret = (userDao.getUserbyId(id));

		return ret;
	}

}

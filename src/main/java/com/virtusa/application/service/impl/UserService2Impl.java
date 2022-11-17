package com.virtusa.application.service.impl;

import org.springframework.stereotype.Service;

import com.virtusa.application.model.Users;
import com.virtusa.application.service.UserService;

@Service

public class UserService2Impl implements UserService{


	@Override
	public Users getUserById(Long id, String attr) {
		// TODO Auto-generated method stub
		return new Users();
	}

	
}

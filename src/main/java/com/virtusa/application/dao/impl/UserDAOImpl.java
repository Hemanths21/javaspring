package com.virtusa.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.application.dao.UserDAO;
import com.virtusa.application.model.Users;
import com.virtusa.application.repository.UserRepository;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired  
	UserRepository userRepository;  
	
	@Override
	public Users getUserbyId(long id)   
	{  
		return userRepository.findById(id).get();  
	}  

	@Override
	public String retriveUserEmail(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get().getEmail();
	}

	@Override
	public String retriveUserFirstName(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get().getFirst_name();
	}
}


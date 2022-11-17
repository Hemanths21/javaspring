package com.virtusa.application.dao;

import com.virtusa.application.model.Users;

public interface UserDAO {
	public String retriveUserEmail(Long id);
	public String retriveUserFirstName(Long id);
	Users getUserbyId(long id);

}

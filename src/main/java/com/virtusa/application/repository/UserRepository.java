package com.virtusa.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.application.model.Users;

public interface UserRepository extends CrudRepository<Users, Long>  
{  
}  

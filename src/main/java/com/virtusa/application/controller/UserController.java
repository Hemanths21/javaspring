package com.virtusa.application.controller;

import org.springframework.web.bind.annotation.RestController;

import com.virtusa.application.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;  

@RestController 
@RequestMapping("/api")
public class UserController   
{  
	@Autowired
	//@Qualifier("redendantService") // using 2 different service of same name
	UserService userservice ; 
	
	@RequestMapping("/")  
	public String hello()   
	{  
		return "Hello User";  
	}  
	
	
	@GetMapping("/users/{id}")  
	public GenericResponse getUsers(@PathVariable long id, @RequestParam (name = "attr", required = false) String attr)   
	{  
		GenericResponse gr = new GenericResponse();
		gr.setData(userservice.getUserById(id,attr));
		return gr;
	} 
	
}  
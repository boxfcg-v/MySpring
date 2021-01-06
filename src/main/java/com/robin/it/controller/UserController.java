package com.robin.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robin.it.module.User;
import com.robin.it.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private  UserService   userService;
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User>  getUsers(){
		List<User> users = userService.getUsers();
		return users;
	}

}

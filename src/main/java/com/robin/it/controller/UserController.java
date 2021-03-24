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
	// http://localhost:8080/MySpring/addUser?userId=51&&account=shenzhen1&&password=shenzhen1
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(User user){
		userService.addUser(user);
		
		return "ok-addUser";
	}
	
	// http://localhost:8080/MySpring/deleteUser?userId=39
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public String  getUsers(Integer userId){
		 userService.deleteUser(userId);
		 return "OK-getUsers";
	}
	
	//http://localhost:8080/MySpring/addUser?userId=51&&account=shenzhen1&&password=shenzhen1
	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public String updateUser(User user){
		  userService.updateUser(user);
		return "KO-updateUser";
	}
	
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public List<User>  getUsers(){
		List<User> users = userService.getUsers();
		return users;
	}
	
	
	

}

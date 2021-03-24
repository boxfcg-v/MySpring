package com.robin.it.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.robin.it.module.User;
import com.robin.it.service.UserService;

@Component
public class SignJob {
	
	@Autowired
	private  UserService   userService;
	public void doJob(){
		System.out.println("dddd====================");
		List<User> users =userService.getUsers();
		int num = users==null? 0:users.size();
		System.out.println("There are {"+num+"} record have been retrieve." );
		 
	}

}

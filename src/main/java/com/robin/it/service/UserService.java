package com.robin.it.service;

import java.util.List;

import com.robin.it.module.User;

public interface UserService {
	
	/**
	 * @return
	 */
	public List<User>  getUsers();
	
	
	public int   addUser(User user);
	
	public int  deleteUser(Integer userId);
	
	public int  updateUser(User user);

}

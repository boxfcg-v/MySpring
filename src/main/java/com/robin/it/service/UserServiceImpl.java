package com.robin.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.robin.it.dao.UserMapper;
import com.robin.it.module.User;
import com.robin.it.module.UserExample;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private   UserMapper  userMapper;

	
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		UserExample  example  = new UserExample();
		
		UserExample.Criteria  criteria = example.createCriteria();
		 criteria.andUserIdGreaterThan(Integer.valueOf(1));
		
		List<User> users = userMapper.selectByExample(example);
		System.out.println(JSON.toJSONString(users));
		return users;
	}

}

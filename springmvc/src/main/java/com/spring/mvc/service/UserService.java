package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.controller.User;
import com.spring.mvc.hibernateorm.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	
	public int 	createUser (User user) {
		return this.userdao.saveUser(user);
	}
}

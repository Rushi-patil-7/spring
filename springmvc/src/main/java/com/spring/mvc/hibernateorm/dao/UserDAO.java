package com.spring.mvc.hibernateorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.controller.User;

@Repository
public class UserDAO {

	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
	int id=	(Integer ) this.hibernateTemplate.save(user);
		
		return id;
	}
}

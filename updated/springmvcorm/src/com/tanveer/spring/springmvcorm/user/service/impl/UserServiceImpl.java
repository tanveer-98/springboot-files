package com.tanveer.spring.springmvcorm.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tanveer.spring.springmvcorm.user.User;
import com.tanveer.spring.springmvcorm.user.dao.UserDao;
import com.tanveer.spring.springmvcorm.user.service.UserService;


// UserServiceImpl depends on userDao
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	public List<User> getUsers() {
		
		return dao.findUsers();
	}

	public User getUser(Integer id) {
		return dao.findUser(id);
	}


	
	
	
	
	
	

}

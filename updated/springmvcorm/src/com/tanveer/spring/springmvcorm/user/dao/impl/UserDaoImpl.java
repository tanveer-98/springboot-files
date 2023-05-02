package com.tanveer.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tanveer.spring.springmvcorm.user.User;
import com.tanveer.spring.springmvcorm.user.dao.UserDao;

public class UserDaoImpl implements UserDao {
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernate() {
		return hibernateTemplate;
	}

	public void setHibernate(HibernateTemplate hibernate) {
		this.hibernateTemplate = hibernate;
	}

	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	
	}

	public User findUser(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}

}

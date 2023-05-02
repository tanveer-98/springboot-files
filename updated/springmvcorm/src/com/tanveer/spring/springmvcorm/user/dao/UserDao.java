package com.tanveer.spring.springmvcorm.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tanveer.spring.springmvcorm.user.User;


@Repository
public interface UserDao {
  int create(User user);
  List<User> findUsers();
  
  //get the user using ID 
  User findUser(Integer id);
  
}

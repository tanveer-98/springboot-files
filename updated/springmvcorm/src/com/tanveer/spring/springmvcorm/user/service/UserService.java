package com.tanveer.spring.springmvcorm.user.service;

import java.util.List;

import com.tanveer.spring.springmvcorm.user.User;

public interface UserService {
  int save(User user);
  List<User> getUsers();
  User getUser(Integer id);
}

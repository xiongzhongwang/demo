package com.javen.service;  

import java.util.List;

import com.javen.model.User;
  
  
public interface IUserService {  
	int addUser(User user);
	int updateUser(User user);
	/**
	 * 查询所有用户
	 * @return UserList
	 */
	List<User> queryUserList(User user);
}  
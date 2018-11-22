package com.javen.dao;

import java.util.List;

import com.javen.model.User;


public interface IUserDao {
	/**
	 * 新增用户
	 * @param user
	 * @return 
	 */
	int insertUser(User user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return 
	 */
	int updateUser(User user);
	
	/**
	 * 查询所有用户
	 * @return UserList
	 */
	List<User> queryUserList(User user);
}
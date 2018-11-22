package com.javen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javen.dao.IUserDao;
import com.javen.model.User;
import com.javen.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;
	
	@Transactional
	public int addUser(User user) {
		//空值判断
		if(user==null) {
			return 0;
		}
		try {
			int effectedNum = userDao.insertUser(user);
			if(effectedNum<=0) {
				throw new RuntimeException("新增用户失败");
			}
			return effectedNum;
		} catch (Exception e) {
			throw new RuntimeException("addUser error"+e.getMessage());
		}
	};

	@Transactional
	public int updateUser(User user) {
		//空值判断
		if(user==null) {
			return 0;
		}
		try {
			int effectedNum = userDao.updateUser(user);
			if(effectedNum<=0) {
				throw new RuntimeException("新增用户失败");
			}
			return effectedNum;
		} catch (Exception e) {
			throw new RuntimeException("updateUser error"+e.getMessage());
		}
	}
	
	public List<User> queryUserList(User user) {
		return userDao.queryUserList(user);
	}

}

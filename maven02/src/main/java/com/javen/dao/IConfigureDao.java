package com.javen.dao;

import java.util.List;

import com.javen.model.Configure;

public interface IConfigureDao {

	/**
	 * 新增用户配置信息
	 * @param configure
	 * @return 
	 */
	int insertConfigure(Configure configure);
	
	/**
	 * 更新用户配置信息
	 * @param configure
	 * @return 
	 */
	int updateConfigure(Configure configure);
	
	/**
	 * 查询用户配置信息
	 * @return UserList
	 */
	List<Configure> queryConfigureList(Configure configure);
}

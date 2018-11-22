package com.javen.dao;

import java.util.List;

import com.javen.model.Wechart;

public interface IWechartDao {

	/**
	 * 新增微信
	 * @param Wechart
	 * @return 
	 */
	int insertWechart(Wechart wechart);
	
	/**
	 * 更新微信
	 * @param Wechart
	 * @return 
	 */
	int updateWechart(Wechart wechart);
	
	/**
	 * 查询所有微信
	 * @return WechartList
	 */
	List<Wechart> queryWechartList(Wechart wechart);
}

package com.javen.dao;

import java.util.List;

import com.javen.model.Device;

public interface IDeviceDao {

	/**
	   *  新增设备信息
	 * @param Device
	 * @return 
	 */
	int insertDevice(Device device);
	
	/**
	   *  更新设备信息
	 * @param Device
	 * @return 
	 */
	int updateDevice(Device device);
	
	/**
	 * 查询用户设备信息
	 * @return deviceList
	 */
	List<Device> queryDeviceList(Device device);
}

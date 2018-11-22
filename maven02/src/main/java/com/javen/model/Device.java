package com.javen.model;

/**
 * 设备信息表
 * */
public class Device {
	private Integer userId;//用户ID
	private Integer deviceId;//设备编号
	private String status;//连接状态
	private String runMode;//运行方式
	private String deviceLog;//设备日志
	private String vpnServer;//vpn服务器地址
	private String vpnAccount;//VPN账号
	private String vpnPassword;//VPN密码
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRunMode() {
		return runMode;
	}
	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}
	public String getDeviceLog() {
		return deviceLog;
	}
	public void setDeviceLog(String deviceLog) {
		this.deviceLog = deviceLog;
	}
	public String getVpnServer() {
		return vpnServer;
	}
	public void setVpnServer(String vpnServer) {
		this.vpnServer = vpnServer;
	}
	public String getVpnAccount() {
		return vpnAccount;
	}
	public void setVpnAccount(String vpnAccount) {
		this.vpnAccount = vpnAccount;
	}
	public String getVpnPassword() {
		return vpnPassword;
	}
	public void setVpnPassword(String vpnPassword) {
		this.vpnPassword = vpnPassword;
	}
}

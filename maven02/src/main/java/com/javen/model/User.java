package com.javen.model;

public class User {

	private Integer id;//ID	
	private String loginName;//登录名
	private String password;//密码
	private String userName;//用户姓名
	private String phone;//联系电话
	private Integer authority;//权限
	private String loginIp;//登录IP
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAuthority() {
		return authority;
	}
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
}

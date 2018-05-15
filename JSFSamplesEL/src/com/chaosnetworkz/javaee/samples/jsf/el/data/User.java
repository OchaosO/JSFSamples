package com.chaosnetworkz.javaee.samples.jsf.el.data;

import com.chaosnetworkz.javaee.samples.jsf.el.Gender;

public class User {

	private String loginName;
	private String password;
	private Gender gender;
	
	public User() {
		
	}
	
	public User(String loginName, String password, Gender gender) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.gender = gender;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
}

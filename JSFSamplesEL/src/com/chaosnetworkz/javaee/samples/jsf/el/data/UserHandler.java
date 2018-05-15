package com.chaosnetworkz.javaee.samples.jsf.el.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.chaosnetworkz.javaee.samples.jsf.el.NewUserBean;

@ApplicationScoped
public class UserHandler implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ArrayList<User> users = new ArrayList<User>();

	public void add(NewUserBean currentUser) {
		User user  = new User(currentUser.getLoginName(), currentUser.getPassword(), currentUser.getGender());
		users.add(user);
	}
	
	public List<User> getUsers() {
		return users;
	}
	
}

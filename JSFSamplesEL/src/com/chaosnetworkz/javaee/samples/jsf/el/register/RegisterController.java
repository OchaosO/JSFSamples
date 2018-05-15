package com.chaosnetworkz.javaee.samples.jsf.el.register;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.chaosnetworkz.javaee.samples.jsf.el.data.User;
import com.chaosnetworkz.javaee.samples.jsf.el.data.UserHandler;

@Named
@FlowScoped("register")
//Hier findet die Verarbeitung statt
public class RegisterController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private UserHandler userHandler;
	
	@Inject
	private RegisterBean registerBean;
	
	public String flowReturnValue() {
		
		User user = new User();
				
		user.setGender( registerBean.getGender() );
		user.setLoginName( registerBean.getLoginName() );
		user.setPassword( registerBean.getPassword() );

		userHandler.getUsers().add(user);
		
		return "register_done";
		
	}

}

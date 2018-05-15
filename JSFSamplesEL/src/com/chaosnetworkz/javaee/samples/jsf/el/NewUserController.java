package com.chaosnetworkz.javaee.samples.jsf.el;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;

import com.chaosnetworkz.javaee.samples.jsf.el.data.User;
import com.chaosnetworkz.javaee.samples.jsf.el.data.UserHandler;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
@SessionScoped
public class NewUserController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private NewUserBean newUserBean;
	
	@Inject
	private UserHandler userHandler;
	
	public void handleButtonClicked( ActionEvent event) {
		userHandler.add(newUserBean);
		newUserBean.setShowMessage(true);
	}
	
	public List<SelectItem> getGenders() {
		
		ArrayList<SelectItem> genders = new ArrayList<SelectItem>();
		genders.add( new SelectItem(Gender.Male.toString(), "Männlich"));
		genders.add( new SelectItem(Gender.Female.toString(), "Weiblich"));
		genders.add( new SelectItem(Gender.SomethingElse.toString(), "Unbekannt"));
		
		return genders;
		
	}
	
	public List<User> getUsers() {
		return userHandler.getUsers();
	}
	
	public String getTime() {
		final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(new Date())+" Uhr";
	}

}

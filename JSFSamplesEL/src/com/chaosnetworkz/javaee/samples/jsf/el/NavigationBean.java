package com.chaosnetworkz.javaee.samples.jsf.el;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.chaosnetworkz.javaee.samples.jsf.el.data.UserHandler;

@Named
@ApplicationScoped
public class NavigationBean {
	
	@Inject
	private UserHandler userHandler;
	
	public String showUsers() {
		if (userHandler.getUsers().size() > 0) {
			//Impizite navigation -> Angabe der xhtml Datei
			return "ZeigeUser";
		}
		
		//Explizite Navigation per face.config Regel
		return "failure";
	}
	

}

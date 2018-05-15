package com.chaosnetworkz.javaee.samples.jsf.el.register;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.chaosnetworkz.javaee.samples.jsf.el.Gender;

@Named
@FlowScoped("register")
public class RegisterBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotNull(message="Bitte geben Sie einen Anmeldenamen ein!")
	@Size(min=3, max=10, message="Die Länge muss zwischen 3 und 10 Zeichen liegen!")
	private String loginName;
	
	@NotNull(message="Bitte geben Sie ein Passwort ein!")
	@Size(min=3, max=10, message="Die Länge muss zwischen 3 und 10 Zeichen liegen!")
	private String password;
	
	@NotNull
	private Gender gender;

	@NotNull
	private boolean acceptedTerms;

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

	public boolean isAcceptedTerms() {
		return acceptedTerms;
	}

	public void setAcceptedTerms(boolean acceptedTerms) {
		this.acceptedTerms = acceptedTerms;
	}
	
	
	
	
}

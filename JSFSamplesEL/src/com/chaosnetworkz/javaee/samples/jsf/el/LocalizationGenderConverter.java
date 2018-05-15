package com.chaosnetworkz.javaee.samples.jsf.el;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@Named
@FacesConverter("LocalizationGenderConverter")
public class LocalizationGenderConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Gender gender = (Gender) value;
		switch(gender) {
			case Male:
				return "Männlich";
			case Female:
				return "Weibich";
			default:
				return "unbekannt";
		}
		
	}

}

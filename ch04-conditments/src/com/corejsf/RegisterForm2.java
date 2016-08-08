package com.corejsf;

import java.io.Serializable;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "form2") // or @Named("form")
@SessionScoped
public class RegisterForm2 implements Serializable {
	private HashMap conditments = null;

	public HashMap getConditments() {
		if (conditments == null) {
			conditments = new HashMap();
			conditments.put("Cheese", new Integer(1)); // key,value
			conditments.put("Pickle", new Integer(2));
			conditments.put("Mustard", new Integer(3));
			conditments.put("Lettuce", new Integer(4));
			conditments.put("Onions", new Integer(5));
		}
		return conditments;
	}

	public HashMap getConditmentsItems() {
		return conditments;
	}

}
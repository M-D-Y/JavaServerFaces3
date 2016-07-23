package com.corejsf;

import java.io.Serializable;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

//@ManagedBean(name="user") // 
@Named("emptyBean")
@SessionScoped
public class EmptyBean implements Serializable {
/*	private String name = "EmptyBean";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
*/
}

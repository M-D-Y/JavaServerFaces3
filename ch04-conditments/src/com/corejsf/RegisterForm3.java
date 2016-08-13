package com.corejsf;

import java.io.Serializable;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name = "form3") // or @Named("form")
@SessionScoped
public class RegisterForm3 implements Serializable {

	private static SelectItem[] burgerItems = { new SelectItem("Qwarter pounder"), new SelectItem("Single"),
			new SelectItem("Veggie"), };
	private static SelectItem[] beverageItems = { new SelectItem("Coke"), new SelectItem("Pepsi"), new SelectItem("Water"),
			new SelectItem("Coffee"), new SelectItem("Tea"), };
	private static SelectItem[] condimentItems = { new SelectItem("cheese"), new SelectItem("pickle"),
			new SelectItem("mustard"), new SelectItem("lettuce"), new SelectItem("onions"), };

	
	// The burgers, beverages, and condiments variables are SelectItemGroup
	// instances that are instantiated like this:

	private static SelectItemGroup burgers = new SelectItemGroup("Burgers", // value
			"burgers on the menu", // description
			false, // disabled
			burgerItems); // select items
	private static SelectItemGroup beverages = new SelectItemGroup("Beverages", // value
			"beverages on the menu", // description
			false, // disabled
			beverageItems); // select items
	private static SelectItemGroup condiments = new SelectItemGroup("Condiments", // value
			"condiments on the menu", // description
			false, // disabled
			condimentItems); // select items
	
	private static SelectItem[] menuItems = { burgers, beverages, condiments };

	public SelectItem[] getMenuItems() {
		return menuItems;
	}
}
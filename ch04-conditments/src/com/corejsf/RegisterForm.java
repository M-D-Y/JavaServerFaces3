package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
//import javax.faces.bean.ManagedBean;
import javax.inject.Named;

//@ManagedBean(name = "form") // or 
@Named("form")
@SessionScoped
public class RegisterForm implements Serializable {
	private SelectItem conditment_old = new SelectItem(new Integer(1), "Mustard");

	private SelectItem conditment = new SelectItem("Mustard");
	private Integer yearOfBirth;

	private SelectItem[] conditments_old = { new SelectItem(new Integer(1), "Cheese"),
			new SelectItem(new Integer(2), "Pickle"), new SelectItem(new Integer(3), "Mustard"),
			new SelectItem(new Integer(4), "Lettuce"), new SelectItem(new Integer(5), "Onions") };
	
	private SelectItem[] conditments = { new SelectItem("Cheese"),
			new SelectItem("Pickle"), new SelectItem("Mustard"),
			new SelectItem("Lettuce"), new SelectItem("Onions") };

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer newValue) {
		yearOfBirth = newValue;
	}

	private static Collection<SelectItem> birthYears;
	static {
		birthYears = new ArrayList<SelectItem>();
		// The first item is a "no selection" item
		birthYears.add(new SelectItem(null, "Pick a year:", "", false, false, true));
		for (int i = 1900; i < 2020; ++i)
			birthYears.add(new SelectItem(i));
	}

	public Collection<SelectItem> getYearItems() {
		return birthYears;
	}

	/**
	 * @return the condiments
	 */
	public SelectItem[] getConditments() {
		return conditments;
	}

	/**
	 * @param condiments
	 *            the condiments to set
	 */

	public void setCondiments(SelectItem[] condiments) {
		this.conditments = condiments;
	}

	public SelectItem getCheeseItem() {
		return new SelectItem("Cheese");
	}

	public SelectItem[] getConditmentsItems() {
		return conditments;
	}

	/**
	 * @return the conditment
	 */
	public SelectItem getConditment() {
		return conditment;
	}

	/**
	 * @param conditment
	 *            the conditment to set
	 */
	
	 public void setConditment(SelectItem conditment) { this.conditment =
	 conditment; }
	 
}

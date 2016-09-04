/**
 * TODO: comments
 */
package com.corejsf.test;

import org.junit.Test;

import com.corejsf.CreditCard;
import com.corejsf.CreditCardConverter;

/**
 * TODO: comments
 * 
 * @author admin
 *
 * @since 4 сент. 2016 г.
 */
public class TestCreditCardConverter {

	@Test
	public void test() {
		//test1();
		test2();
	}
	public void test2() {
		String card = "5555111144443333";
		CreditCardConverter converter = new CreditCardConverter();
		System.out.println(converter.getAsObject(null, null, card).toString());
	}
	public void test1() {
		// fail("Not yet implemented");
		CreditCard card = new CreditCard("5555111144443333");
		CreditCardConverter converter = new CreditCardConverter();
		System.out.println(converter.getAsString(null, null, card));

	}

}

package com.automation.day13.Oct_14_2023;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_Concepts {

	// SoftAssert class (will continue to print or execute after failure unlike hard
	// Assert where it skips)
	// Assert class - is known as Hard Assert
	// What is the difference between SoftAssert and Assert?

	// you have to create the Object of SoftAssert Class

	@Test
	public void mathematics() {

		SoftAssert softassert = new SoftAssert();

		System.out.println("start");
		System.out.println(2 + 3);
		// Assert.assertTrue(2 > 3);
		softassert.assertTrue(2 > 3); // false
		System.out.println("end");
		softassert.assertTrue(400 != 400); // false

		softassert.assertAll(); // it is accumulating all the false statements

		// why is it when you don't use assertAl() the code passes?
	}
}

package com.automation.day13.Oct_14_2023;

import org.testng.annotations.Test;

public class Assertions_Basic_Concepts {

	// Assert a WebPage at how many levels?
	// getTitle()
	// getCurrentUrl()
	// getPageSource()

	// Assert a WebElement ?
	// isEnabled() link
	// isDisplayed() image
	// isSelected() radio button

	@Test
	public void mathematics() {
		System.out.println("Begin"); // this is fine
		System.out.println(2 + 3); // this is fine
		System.out.println(5 / 0); // there is an arithmetic exception so there is a failure
		System.out.println("End"); // this won't get executed
	}
}

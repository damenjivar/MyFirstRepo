package com.java.day16.Oct_22_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationCode {

	@Test
	public void setup() {

		WebDriver driver = new ChromeDriver();
		// WebDriver is an interface
		// driver is the reference of the interface
		// ChromeDriver is the implementing class
		// new ChromeDriver() is the object of the implementing class

		// whenever we use () it represents methods

		driver.manage().window().maximize(); // manage(), window() and maximize() are all unimplemented or abstract
												// methods of interface. 

	}
}
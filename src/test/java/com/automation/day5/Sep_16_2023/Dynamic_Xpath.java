package com.automation.day5.Sep_16_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	// there are typically 8 different syntaxes for Xpath

	// there are certain functions which can be used in Xpath

	// there are certain keywords which can be used in Xpath

	// dynamic Xpath is also known as Relative Xpath or Customized Xpath as it is
	// customized by the Automation Tester

	// What is the Catch in writing Xpath?
	// make sure the xpath is 1 of 1 in the Chrome Browser Editor
	// how will you open the Chrome Browser Editor?
	// Chrome Browser editor is the space where we write Xpaths

	// once you right click on a WebElement and the DOM opens, simple press Ctrl+F
	// on your keyboard
	// Syntax 1:

	// html[@attribute = 'valueofthatattribute']
	
	//syntax 2: 
	
	//html[@attribute1 = 'value1' and @attribute2 = 'value2']
	
	//syntax 3:
	
	//html[@attribute1 = 'value1' or @attribute2 = 'value2']

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

}

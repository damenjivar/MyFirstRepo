package com.automation.day9.Sep_30_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatingStringMethods {

	public WebDriver driver;

	@Test
	public void checkingEqualsMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
		String expectedEditAccountInfoLink = "Edit your account information";
		
		System.out.println(actualEditAccountInfoLink.equals(expectedEditAccountInfoLink));

	}

}

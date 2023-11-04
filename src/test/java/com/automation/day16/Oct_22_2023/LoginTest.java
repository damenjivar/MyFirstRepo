package com.automation.day16.Oct_22_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase_Parent {

	public LoginTest() throws Exception {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void LoginSetup() {
		driver = initializeBrowserAndOpenApplication("chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test
	public void TNLogin() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
package com.automation.day13.Oct_14_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependency_Between_TestCases {

	public WebDriver driver;

	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void clickOnMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
	}

	@Test(priority = 2, dependsOnMethods = "clickOnMyAccountLink")
	public void clickOnLoginOption() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority = 3, dependsOnMethods = { "clickOnMyAccountLink", "clickOnLoginOption" })
	public void login() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click(); // mistake on purpose to skip
	}

	@Test(priority = 4, dependsOnMethods = { "clickOnMyAccountLink", "clickOnLoginOption", "login" })
	public void logout() { // if a test case is dependent on another test case and that test case fails,
							// then this test case will be skipped, it will not be executed
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
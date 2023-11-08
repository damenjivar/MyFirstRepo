package com.automation.day18.Oct_29_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest_Retry_Failed_TestCase {

	public WebDriver driver;

	@Test(retryAnalyzer = MyRetry.class)
	public void loginValidationCorrectCredentials() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		Assert.fail("deliberately failing to show how to rey failed test cases in TestNG");

		// As a fail safe you want to make sure that those test cases which failed in
		// the first run, gets 2 or 3 more chances to run.

		// Could be that there are Internet issues, the particular WebElement could not
		// render properly, or during the time of execution maybe the server was slow.
		// The responses were slow.
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

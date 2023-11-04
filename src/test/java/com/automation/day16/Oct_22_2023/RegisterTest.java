package com.automation.day16.Oct_22_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.Sep_30_Day9_SpecialClasses.Util;

public class RegisterTest extends TestBase_Parent {

	public RegisterTest() throws Exception {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void RegisterSetup() {
		driver = initializeBrowserAndOpenApplication("chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@Test
	public void TNRegister() {
		driver.findElement(By.id("input-firstname")).sendKeys("selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("panda");
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver
				.findElement(
						By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']"))
				.isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
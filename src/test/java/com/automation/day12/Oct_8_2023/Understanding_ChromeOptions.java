package com.automation.day12.Oct_8_2023;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Understanding_ChromeOptions {

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions(); // we are creating the Object of ChromeOptions Class
		// we can control the speed of our execution - Faster, Same speed, Slow it down
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); // use this if your webpage is stable and fast
		// options.setPageLoadStrategy(PageLoadStrategy.NONE);
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized"); // maximizing the browser so we do not need
													// driver.manage().window().maximize();
		options.addArguments("--incognito"); // to open the browser in incognito mode
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars")); // this
																													// will
																													// disable
																													// infobar
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

	}

	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority = 2)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test(priority = 3)
	public void verifyLoginWithInvalidEMailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda2345@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test(priority = 4)
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test(priority = 5)
	public void verifyLoginWithoutCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

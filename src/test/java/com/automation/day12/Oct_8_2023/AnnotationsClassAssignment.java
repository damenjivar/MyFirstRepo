package com.automation.day12.Oct_8_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsClassAssignment {

	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test
	public void verifyLoginWithInvalidEMailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda2345@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Test
	public void verifyLoginWithoutCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}

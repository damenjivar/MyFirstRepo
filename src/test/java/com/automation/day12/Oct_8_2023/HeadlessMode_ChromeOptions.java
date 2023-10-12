package com.automation.day12.Oct_8_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeadlessMode_ChromeOptions {

	// means the browsers will not open in the Front End UI application
	// everything will happen in the backend

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void searchWithValidProduct() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}

	@Test(priority = 2)
	public void searchWithInvalidProduct() {
		driver.findElement(By.name("search")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}

	@Test(priority = 3)
	public void searchWithNoProduct() {
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

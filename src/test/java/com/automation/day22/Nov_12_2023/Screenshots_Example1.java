package com.automation.day22.Nov_12_2023;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots_Example1 {
//HW
	WebDriver driver;

	@Test
	public void openWeatherMap() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");

		// Step 1: Whichever WebElement you want screenshot of highlight it separately
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));

		// Step 2: Using the logo we can call a method known as getScreenshotAs()
		File source = logo.getScreenshotAs(OutputType.FILE);

		// Step 3: Manually create the screenshots folder where you want these
		// screenshots saved.
		File destination = new File(
				System.getProperty("user.dir") + "\\test-output\\Screenshots\\OpenWeatherMaplogo.png");

		// Step 4: Use the FileHandler class to copy the source file into destination
		// path.
		FileHandler.copy(source, destination);
	}

	@Test
	public void ShaadiHomePageBanner() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		WebElement logo = driver.findElement(By.xpath("//div[@id='_next']/child::div[1]"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				System.getProperty("user.dir") + "\\test-output\\Screenshots\\ShaadiHomeBanner.png");
		FileHandler.copy(source, destination);
	}

	@Test
	public void tnHomePageLogo() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		WebElement logo = driver.findElement(By.xpath("//div[@id='logo']"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\TNLogo");
		FileHandler.copy(source, destination);
	}
}

package com.automation.day14_Oct_15_2023;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PropertiesFileClassAssignmentRediffLogin {

	public WebDriver driver;

	@Test
	public void rediffLogin() throws Exception {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\day14_Oct_15_2023\\config.properties");
		prop.load(ip);

		String browserName = "chrome";
		if (browserName.equals(prop.getProperty("browser"))) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("login1")).sendKeys("validRediffUsername");
		driver.findElement(By.id("password")).sendKeys("validRediffPassword");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.quit();
	}
}
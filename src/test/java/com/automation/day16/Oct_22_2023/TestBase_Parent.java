package com.automation.day16.Oct_22_2023;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase_Parent {

	// write some code in the parent Class
	// You can create the constructor of the parent class and write whatever logic
	// you want to write.

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;

	public TestBase_Parent() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\day16\\Oct_22_2023\\config.Properties");
		prop.load(ip);
	}

	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");

		return driver;
	}
}
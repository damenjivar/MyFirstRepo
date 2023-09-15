package com.automation.day4.Sep_10_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_How_Selenium_Works {

	public static void main(String[] args) {
		// every laptop is a client
		// you write the selenium code with OOP language of your choice in the client
		// this code interacts with the server of the application you want to use
		// the application is in form of a website
		// so to interact with that application you need a browser
		// selenium + OOP language code interacts with the drivers of that browser which
		// in turn interacts with the browser
		// finally we see the outcome in the browser as a UI (user interface)

		// selenium is an API library

		WebDriver driver = new ChromeDriver(); // opens blank Chrome browser

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://makemytrip.com");
		driver.quit();
	}
}

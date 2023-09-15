package com.automation.day4.Sep_10_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_WebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://support.rediff.com");
		
		WebElement signinLink;
		WebElement createAccountLink;
		WebElement moneyLink;
		WebElement videosLink;
		WebElement shoppingLink;
		
	}
}

package com.automation.day6.Sep_17_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validation {

	// in each page validate the WebPage level and WebElement validations

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		// landing page
		String actualTitle = driver.getTitle();
		String expectedTitle = "";
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://rediff.com";

		WebElement logo = driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));

		if (actualTitle.equals(expectedTitle) && logo.isDisplayed() && createAccountLink.isEnabled()) {
			System.out.println("landing page is correct");
			driver.findElement(By.className("signin")).click();
		} else {
			System.out.println("landing page is incorrect");
		}

		// login page
		System.out.println("Login page title is: " + driver.getTitle());
		System.out.println("Login page current url is: " + driver.getCurrentUrl());

		String actualTitleLoginPage = driver.getTitle();
		String expectedTitleLoginPage = "Rediffmail";

		String actualCurrentUrlLoginPage = driver.getCurrentUrl();
		String expectedCurrentUrlLoginPage = "https://mail.rediff.com/cgi-bin/login.cgi";

		WebElement usernameTextbox = driver.findElement(By.id("login1"));
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));

		if (actualTitleLoginPage.equals(expectedTitleLoginPage)
				&& actualCurrentUrlLoginPage.equals(expectedCurrentUrlLoginPage) && usernameTextbox.isDisplayed()
				&& passwordTextbox.isEnabled()) {
			usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextbox.sendKeys("Selenium@123");
			loginButton.click();
		}else {
			System.out.println("login page is not validated");
		}
		driver.findElement(By.className("rd_logout")).click();

		// inbox page

		// logout page
		
		
	}

	public static void landingPage() {

	}

	public static void loginPage() {

	}

	public static void inboxPage() {

	}

	public static void logoutPage() {

	}

}

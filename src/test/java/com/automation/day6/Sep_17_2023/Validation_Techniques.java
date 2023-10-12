package com.automation.day6.Sep_17_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Techniques {

	// at a WebPage level there are 3 validation methods which have been defined in
	// Selenium
	// getCurrentUrl()
	// getTitle()
	// getPageSource()

	// at a WebElement level there are again 3 validation methods which have been
	// defined in Selenium

	// isDisplayed()
	// isEnabled()
	// isSelected()

	public static void main(String[] args) {

		validationAtWebpageLevel();
	}

	public static void validationAtWebpageLevel() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle()); // Rediff.com: News | Rediffmail | Stock Quotes | Shopping
		System.out.println(driver.getCurrentUrl()); // https://www.rediff.com/

		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("my landing page is correct");
		} else {
			System.out.println("my landing page is incorrect");
		}

		if (driver.getTitle().equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")
				&& driver.getCurrentUrl().equals("https://www.rediff.com")) {
			driver.findElement(By.className("signin")).click();
		} else {
			System.out.println("my landing page title and current url are incorrect");
		}

		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));

		if (usernameTextBox.isEnabled() && passwordTextBox.isEnabled() && loginButton.isDisplayed()) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextBox.sendKeys("Selenium@123");
			loginButton.click();
		} else {
			System.out.println("username and password textbox are not enabled");
		}

	}

	public void validationAtWebElementLevel() {

	}
}

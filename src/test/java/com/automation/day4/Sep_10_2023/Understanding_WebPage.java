package com.automation.day4.Sep_10_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_WebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();

		// babysteps for coding
		// WebElement signinLink = driver.findElement(By.className("signin"));
		// signinLink.click();
		// WebElement usernameTextBox = driver.findElement(By.id("login1"));
		// usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		// WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		// passwordTextBox.sendKeys("Selenium@123");
		// WebElement loginButton = driver.findElement(By.className("signinbtn"));
		// loginButton.click();
		// WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		// logoutLink.click();

		WebElement createAccountLink;
		WebElement moneyLink;
		WebElement videosLink;
		WebElement shoppingLink;

	}
}
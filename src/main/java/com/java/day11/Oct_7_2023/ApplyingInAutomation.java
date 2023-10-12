package com.java.day11.Oct_7_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingInAutomation {

	public static WebDriver driver;

	public static void main(String[] args) {
		// tutorialsNinjaLogin("https://tutorialsninja.com/demo",
		// "seleniumpanda@gmail.com", "Selenium@123");
		// rediffLogin("https://rediff.com", "seleniumpanda@rediffmail.com",
		// "Selenium@123");
		registerTN("https://tutorialsninja.com/demo", "Selenium", "Panda", "seleniumpanda123323@gmail.com", "1234567890",
				"Selenium@123", "Selenium@123");

	}

	public static void tutorialsNinjaLogin(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}

	public static void rediffLogin(String rediffUrl, String rediffUsername, String rediffPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(rediffUrl);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(rediffUsername);
		driver.findElement(By.id("password")).sendKeys(rediffPassword);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.quit();
	}

	public static void registerTN(String url, String firstName, String lastName, String email, String telephone,
			String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.name("agree")).click();;
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();;
		//driver.quit();

	}
}
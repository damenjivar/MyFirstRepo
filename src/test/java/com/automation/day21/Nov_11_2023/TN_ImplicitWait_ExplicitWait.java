package com.automation.day21.Nov_11_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_ImplicitWait_ExplicitWait {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	}

	@Test(priority = 1)
	public void tnImplicitWaitTest() {
		// Implicit Wait is smart form of wait.
		// Let's say the WebElement appears in 0.5 seconds, then the remaining 9.5
		// seconds will not be utilized, it will just move on.
		// What if the WebElement does not show up until the 9th seconds?
		// That is fine, still you have 1 more second.

		// What if the WebElement does not show up until the 10th second?
		// Then this implicit wait will fail the execution and you will get some kind of
		// Exception.
	}

	@Test(priority = 2)
	public void tnExplicitWaitTest() throws Exception {
		Thread.sleep(3000); // is an example of Explicit Wait. No matter what it will wait out the whole
							// duration. This is rigid. Use when there is no other scope
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority = 3)
	public void tnExplicitWebDriverWaitTest() throws Exception {

		// I want my Explicit Wait to be smart as well.
		// Thread.sleep(0000) is not smart. It is rigid.

		// Step 1: Create the Object of WebDriverWait Class
		// Step 2: In the Constructor you have to pass 2 parameters - driver reference,
		// the other is Duration class.
		// Step 3: Use the wait reference and call the until() method. Overload the
		// until() method with ExpectedConditions class.
		// Step 4: Use the ExpectedConditions class to call any of the methods as per
		// requirement.

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click(); // locator option
		// driver.findElement(By.linkText("My Account")).click(); // let's say My
		// Account is misbehaving

		WebElement loginDropdownOption = driver.findElement(By.linkText("Login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginDropdownOption)).click(); // webelement option
		//driver.findElement(By.linkText("Login")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys("seleniumpanda@gmail.com");
		// driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-password"))).sendKeys("Selenium@123");
		// driver.findElement(By.id("input-password")).sendKeys("Selenium@123");

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.btn.btn-primary"))).click();
		// driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
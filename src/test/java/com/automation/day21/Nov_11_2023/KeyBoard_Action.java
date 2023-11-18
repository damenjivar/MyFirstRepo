package com.automation.day21.Nov_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.java.day9.Sep_30_2023.Util;

public class KeyBoard_Action {

	public WebDriver driver;

	@Test
	public void rediffLogin() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Actions action = new Actions(driver);

		// If we are using Actions Class and keyboard operations then it is better if
		// you specify WebElements separately.

		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));

		// keyDown
		// keyUp
		// sendKeys
		// copy/paste
		// tab

		// Select All - Ctrl+A
		// Copy - Ctrl+C
		// Paste - Ctrl+V
		// Uppercase - Shift+Alphabet

		// action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
		// action.click(password).sendKeys("Selenium@123").perform();
		// action.click(signInButton).perform();

		action.click(username).sendKeys("seleniumpanda@rediffmail.com").sendKeys(Keys.TAB).perform();
		password.sendKeys("Selenium@123"); // WHY DON'T WE NEED TO USE .PERFORM() HERE? IS IT ONLY FOR ACTIONS CLASS?
		signInButton.sendKeys(Keys.ENTER); //WHY DONT WE NEED TO USE ACTION. FIRST?
	}

	@Test
	public void rediffLoginTest2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Actions action = new Actions(driver);
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));

		action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();

		// Selecting all - Ctrl+A
		action.keyDown(username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

		// Copy - Ctrl+C
		action.keyDown(username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		// Paste - Ctrl+V
		action.click(password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.click(signInButton).perform();

	}

	@Test
	public void registerTNTest() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		Actions action = new Actions(driver);

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmpassword = driver.findElement(By.id("input-confirm"));
		WebElement privacyPolicy = driver.findElement(By.name("agree"));
		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));

		action.click(firstname).sendKeys("selenium").sendKeys(Keys.TAB).perform();
		lastname.sendKeys("panda");
		action.click(email).sendKeys(Util.emailWithDateTimeStamp()).sendKeys(Keys.TAB).perform();
		telephone.sendKeys("1234567890");
		action.click(password).sendKeys("Selenium@123").perform();
		Thread.sleep(2000);
		action.keyDown(password, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(password, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.click(confirmpassword).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.click(privacyPolicy).perform();
		continueButton.sendKeys(Keys.ENTER);
		
		//WHY IS THE PASSWORD COMBINATION WRONG???
	}
}

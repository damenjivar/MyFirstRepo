package com.automation.day21.Nov_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tool_Tip {
	// title attribute holds the tool tip
	// WindowHandles HW

	public WebDriver driver;

	@Test
	public void loginTest() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		// determine the tool tip of Create Account
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
		String toolTipText = createAccountLink.getAttribute("title");
		System.out.println("the tooltip of createAccountLink: " + toolTipText);

		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		String toolTipText1 = signInLink.getAttribute("title");
		System.out.println("the tooltip of signInLink: " + toolTipText1);

		WebElement shoppingLink = driver.findElement(By.cssSelector("a.shopicon.relative"));
		String toolTip2 = shoppingLink.getAttribute("title");
		System.out.println("the tooltip of shoppingLink: " + toolTip2);

		WebElement videosLink = driver.findElement(By.className("vdicon"));
		String toolTip3 = videosLink.getAttribute("title");
		System.out.println("the tooltip of videosLink: " + toolTip3);
		
	}
}

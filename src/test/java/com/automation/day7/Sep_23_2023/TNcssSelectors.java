package com.automation.day7.Sep_23_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TNcssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input[id=input-password")).sendKeys("Selenium@123");
		
	}
}

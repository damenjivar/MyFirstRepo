package com.automation.day5.Sep_16_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TNRegister {

	// dynamic Xpath practice

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Dennis");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Menjivar");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("dennismenjivar1@yahoo.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("7032341244");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
}
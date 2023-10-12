package com.automation.day6.Sep_17_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TN_Xpaths {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//div[@class= 'col-sm-10']/child::input[@id='input-firstname']"))
				.sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class='col-sm-10']/child::input[@id='input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//div[@class='col-sm-10']/child::input[@id='input-email']"))
				.sendKeys("seleniumpanda30@gmail.com");
		driver.findElement(By.xpath("//div[@class='col-sm-10']/child::input[@id='input-telephone']"))
				.sendKeys("7039283843");
		driver.findElement(By.xpath("//div[@class='col-sm-10']/child::input[@id='input-password']"))
				.sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class='col-sm-10']/child::input[@id='input-confirm']"))
				.sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class='pull-right']/child::input[@name='agree']")).click();
		driver.findElement(By.xpath("//div[@class='pull-right']/child::input[@class='btn btn-primary']")).click();
	}

}
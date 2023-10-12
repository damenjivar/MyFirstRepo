package com.automation.day8.Sep_24_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");

		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Apr");

		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("10");

		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1976");

		Select select3 = new Select(driver.findElement(By.linkText("Female")));
		select3.selectByVisibleText("Female");

	}
}

package com.automation.day7.Sep_23_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousCss {
	//FINISH

	public static void main(String[] args) {
		//rediffLoginAndLogout();
		TNLoginAndLogout();
		TNRegisterAndAcknowledgement();
	}

	public static void rediffLoginAndLogout() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();

	}

	public static void TNLoginAndLogout() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("div#top_links > ul > li.dropdown > a")).click();
		driver.findElement(By.cssSelector("div#top-links > ul  > li.dropdown > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.list-group > a:nth-child(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
	}

	public static void TNRegisterAndAcknowledgement() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("div#top-links > ul > li.dropdown > a")).click();
		driver.findElement(By.cssSelector("div#top-links > ul > li.dropdown > ul > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Seleniumpanda123453@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("7032942345");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(
				By.cssSelector("fieldset#account + fieldset + fieldset > div > div > label:nth-child(1) > input"))
				.click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}

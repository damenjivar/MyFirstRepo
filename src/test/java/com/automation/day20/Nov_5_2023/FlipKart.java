package com.automation.day20.Nov_5_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FlipKart {

	public WebDriver driver;

	@Test
	public void formalShirts() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com"); //fix
		// i want to print the brand name, description of the shirt, price of the shirt,
		// and discount % is displayed for each of the 40 items.

		Thread.sleep(2000);
		List<WebElement> formalShirts = driver.findElements(By.cssSelector("div._2WkVRV"));
		List<WebElement> description = driver.findElements(By.cssSelector("a.IRpwTa"));
		List<WebElement> prices = driver.findElements(By.cssSelector("div.30jeq3"));
		List<WebElement> discountPercentage = driver.findElements(By.cssSelector("div.3Ay65b"));

		for (int i = 0; i < formalShirts.size(); i++) {
			System.out.println(formalShirts.get(i) + "-----" + description.get(i).getText() + "------"
					+ prices.get(i).getText() + "------" + discountPercentage.get(i).getText());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

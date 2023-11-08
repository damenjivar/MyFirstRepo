package com.automation.day20.Nov_5_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class2_TN_WebElements {

	public WebDriver driver;

	@Test
	public void tutorialsNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links present is: " + links.size());

		WebElement link51 = links.get(50);
		System.out.println("the text of this link is: " + link51.getText());

		System.out.println("the url of link101 is: " + link51.getAttribute("href"));

		System.out.println(link51.getLocation().x + "-----" + link51.getLocation().y);

		for (int i = 0; i < links.size(); i++) {
			WebElement totalTNLinks = links.get(i);
			System.out.println(totalTNLinks.getText() + "-----" + totalTNLinks.isDisplayed());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

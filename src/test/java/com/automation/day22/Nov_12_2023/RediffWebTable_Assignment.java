package com.automation.day22.Nov_12_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffWebTable_Assignment {

	public WebDriver driver;

	@Test
	public void assignment1() {
		// please find the current price of modern steels = 19.60

		String companyName = "Modern Steels";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		for (int i = 0; i < companyNames.size(); i++) {
			if (companyName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText() + "-----" + currentPrices.get(i).getText());
				break;
			}
		}
	}

	@Test
	public void assignment2() {
		// determine the current price of the company present in the 2000th row
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		WebElement companyName = driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr[2000]/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		String companyNameName = companyName.getText();
		System.out.println(companyNameName);

		for (int i = 0; i < companyNames.size(); i++) {
			if (companyNameName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText() + "----" + currentPrices.get(i).getText());
				break;
			}
		}
	}

	@Test
	public void assignment3() {
		// Print 5 rows of the WebTable with the Company name and all the values
		// associated with it.

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> first5Rows = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[position() >0 and position() <=5"));
		for (int i = 0; i < first5Rows.size(); i++) {
			System.out.println(first5Rows.get(i).getText());
		}
	}

	@Test
	public void assignment4() {
		// choose any 5 companies of your choice and get their respective current prices
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		String companyName1 = "Modern Steels";
		String companyName2 = "BMW Industries";
		String companyName3 = "Kovai Medical";
		String companyName4 = "Tinna Trade";
		String companyName5 = "Cranex Ltd";

		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

	}
 //HW
	@Test
	public void assignment4Revised() {

		// choose any 5 companies of your choice and get their respective current prices
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://money.rediff.com/gainers");

				String companyName1 = "Modern Steels";
				String companyName2 = "BMW Industries";
				String companyName3 = "Kovai Medical";
				String companyName4 = "Tinna Trade";
				String companyName5 = "Cranex Ltd";

				List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
				List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

	}
}








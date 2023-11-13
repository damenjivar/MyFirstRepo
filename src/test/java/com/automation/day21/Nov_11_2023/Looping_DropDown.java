package com.automation.day21.Nov_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Looping_DropDown {

	public WebDriver driver;

	@Test(priority = 1)
	public void easeMyTripTravelersLooping() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");

		// preSelection = 1;
		// postSelection = n travelers

		String preSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("travelers before selection is: " + preSelection); // 1

		driver.findElement(By.id("ptravlrNo")).click();

		int Adults = 1;
		while (Adults < 5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1']")).click();
			Adults++;
		}

		int Children = 0;
		while (Children < 2) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_boxChd']")).click();
			Children++;
		}

		int Infant = 0;
		while (Infant < 5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1Inf']")).click();
			Infant++;
		}

		Thread.sleep(1000);
		driver.findElement(By.id("traveLer")).click();
		Thread.sleep(1000);
		String postSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("travelers after selection is: " + postSelection);

	}

	@Test(priority = 2)
	public void spiceJetLoopingTravelers() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		String preselection = driver.findElement(By.id("")).getText();
		System.out.println("the number of people pre-selected: " + preselection);
		
	}

}






















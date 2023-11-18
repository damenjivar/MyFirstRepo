package com.automation.day21.Nov_11_2023;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Actions {

	public WebDriver driver;
	public ChromeOptions options;

	@Test
	public void easeMyTripMouseActions() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://easemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 1: Create the Object of Actions Class
		// Step 2: Pass the driver reference in the Constructor

		Actions action = new Actions(driver);

		// click and hold
		// click and release
		// context click - right click
		// back click
		// forward click
		// double click
		// move to element
		// move by offset - x and y coordinates are changing
		// drag and drop

		WebElement myAccount = driver.findElement(By.id("spnMyAcc"));
		action.moveToElement(myAccount).build().perform();

		WebElement loginButton = driver.findElement(By.id("shwlogn"));
		action.moveToElement(loginButton).click().build().perform();
	}

	@Test
	public void draggable() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// You need to handle frames - frames are not in practice anymore.
		// There could be multiple frames.
		// Frames are also WebElements

		// First you need to determine which frame

		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames are: " + totalFrames.size());

		driver.switchTo().frame(0);

		Actions action = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		action.dragAndDropBy(source, 100, 200).build().perform();

	}

}

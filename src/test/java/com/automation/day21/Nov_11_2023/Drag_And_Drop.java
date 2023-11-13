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

public class Drag_And_Drop {

	public WebDriver driver;
	public ChromeOptions options;

	@Test
	public void droppable() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
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
		WebElement destination = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, destination).build().perform();
	}
}
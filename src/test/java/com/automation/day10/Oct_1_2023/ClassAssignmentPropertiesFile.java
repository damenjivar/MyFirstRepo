package com.automation.day10.Oct_1_2023;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignmentPropertiesFile {

	public static Properties prop;
	public static Properties dataprop;
	public static FileInputStream ip;
	public static FileInputStream ip1;

	public static void main(String[] args) throws Exception {

		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\day10\\Oct_1_2023\\config.properties");

		dataprop = new Properties();
		ip1 = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\day10\\Oct_1_2023\\testdata.properties");

		validLoginTest();
		invalidLoginTest();
		mandatoryRegisterFields();
		noFieldsRegister();

	}

	public static void validLoginTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
	}

	public static void invalidLoginTest() {

	}

	public static void mandatoryRegisterFields() {

	}

	public static void noFieldsRegister() {

	}

}

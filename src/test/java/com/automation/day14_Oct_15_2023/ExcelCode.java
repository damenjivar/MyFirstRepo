package com.automation.day14_Oct_15_2023;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelCode {

	public WebDriver driver;
	public ChromeOptions options;

	@Test(dataProvider = "TNLogin")
	public void loginTNTest(String username, String password) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

	}

	@DataProvider(name = "TNLogin")
	public Object[][] getExcelLoginData() throws Exception {
		Object[][] data = ExcelCode.readFromExcelSheet("LoginTN");
		return data;

	}

	// Create a public static method to write my Excel code so it can be accessed
	// across from anywhere

	public static Object[][] readFromExcelSheet(String sheetName) throws Exception {
		// Step 1: Excel sheet is a file. So we need to validate the same using
		// FileInputStream Class

		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\day14_Oct_15_2023\\TNRegister.xlsx");

		// Step 2: We used Properties Class to handle .properties file. In this case we
		// will use SXXFWorkbook class to handle the Excel sheet.

		XSSFWorkbook workbook = new XSSFWorkbook(ip); // this is for the whole Excel sheet. It is also known as
														// Workbook.

		// Step 3: You have to address individual sheets within the Workbook. So use the
		// workbook reference to call specific methods.
		XSSFSheet sheet = workbook.getSheet(sheetName); // this getSheet() method returns XSSFSheet

		// Step 4: You have to manage rows and columns
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();

		// Step 5: You are doing parameterization. We have to implement @DataProvider
		// What is Rule #1 of @DataProvider? It will return a 2-D Object Array

		// Create a 2-D Object Array
		Object[][] data = new Object[rows][columns];

		// you need to traverse between the Excel sheet to every row and column and use
		// the data? - This is done by using nested for loop

		// outer for loop - is for rows
		// inner for loop - is for columns

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);

			for (int j = 0; j < columns; j++) {
				XSSFCell cell = row.getCell(j);
				// another thing we have to take care of: the data type present in individual
				// column
				CellType celltype = cell.getCellType();

				switch (celltype) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;

				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue()); // you need to convert this to
																						// String using Wrapper Classes
					break;

				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}
			}
		}

		return data;

	}
}
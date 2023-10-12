package com.automation.day12.Oct_8_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Of_TestNG {

	@BeforeSuite
	public void beforeSuiteExecutesFirst() {
		System.out.println("this is @BeforeSuite and it will execute first");
	}

	@BeforeTest
	public void beforeTestExecutesSecond() {
		System.out.println("@BeforeTest executes after @BeforeSuite");
	}

	@BeforeClass
	public void beforeClassExecutesThird() {
		System.out.println("@BeforeClass executes after @BeforeTest");
	}

	@BeforeMethod
	public void beforeMethodExecutesFourth() {
		System.out.println("@BeforeMethod executes after @BeforeClass");
	}

	@Test
	public void testMethodExecutesFifth() {
		System.out.println("this is testCase1");
	}

	@AfterMethod
	public void afterMethodExecutesSixth() {
		System.out.println("@AfterMethod executes after @Test");
	}

	@AfterClass
	public void afterClassExecutesSeventh() {
		System.out.println("@AfterClass executes after @AfterMethod");
	}

	@AfterTest
	public void afterTestExecutesEigth() {
		System.out.println("@AfterTest executes after @AfterClass");
	}

	@AfterSuite
	public void afterSuiteExecutesNinth() {
		System.out.println("@AfterSuite executes after @AfterTest");
	}

}

package com.automation.day12.Oct_8_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Speciality_Of_BeforeMethod_And_AfterMethod {

	// @BeforeMethod runs every time there is a @Test - it will run before the
	// TestCase
	// @AfterMethod runs every time there is a @Test - it will run after the
	// TestCase
	//Tri-combo execution of TestNG

	@BeforeMethod
	public void setup() {
		System.out.println("this is my application setup code");
	}

	@Test
	public void testCase1() {
		System.out.println("this is TestCase logic 1");
	}

	@Test
	public void testCase2() {
		System.out.println("this is TestCase logic 2");
	}

	@Test
	public void testCase3() {
		System.out.println("this is TestCase logic 3");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("closing my logic");
	}
}

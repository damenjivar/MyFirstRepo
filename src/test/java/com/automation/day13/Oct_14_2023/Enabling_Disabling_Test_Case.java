package com.automation.day13.Oct_14_2023;

import org.testng.annotations.Test;

public class Enabling_Disabling_Test_Case {

	@Test(priority = 1, enabled = true) // not necessary to write enabled = true because test case will run anyways
	public void logic1() {

		System.out.println("this is logic 1");
	}

	@Test(priority = 2, enabled = false) // do not write disabled = true
	public void logic2() {

		System.out.println("this is logic 2");
	}

	@Test(priority = 3)
	public void logic3() {

		System.out.println("this is logic 3");
	}
}

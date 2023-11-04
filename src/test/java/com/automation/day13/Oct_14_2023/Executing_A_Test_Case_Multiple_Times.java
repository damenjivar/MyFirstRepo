package com.automation.day13.Oct_14_2023;

import org.testng.annotations.Test;

public class Executing_A_Test_Case_Multiple_Times {

	// invocation count

	@Test(priority = 1)
	public void logic1() {
		System.out.println("hello world");
	}

	@Test(priority = 2)
	public void logic2() {
		System.out.println("hello world tour");
	}

	@Test(priority = 3, invocationCount = 5)
	public void logic3() {
		System.out.println("hello world tour java");
	}
}

package com.automation.day18.Oct_29_2023;

import org.testng.annotations.Test;

//Learning from PnT - I can show you max 5-6 test cases
// In real-time project there might be 500, 600, 2000 test cases
//You must segregate them

//Groups
//How to create Groups
//How to execute groups
//What are MetaGroups? for example you want to define TestCases which will run every night - Overnight
//regular Expressions
//groups at a class level

@Test(groups = "CompleteClassLevelGroup")

public class Groups {

	@Test(groups = { "smoke" })
	public void tc1() {
		System.out.println("this is T1");
	}

	@Test(groups = { "smoke", "sanity" })
	public void tc2() {
		System.out.println("this is T2");
	}

	@Test(groups = { "smoke", "sanity", "regression" })
	public void tc3() {
		System.out.println("this is T3");
	}

	@Test(groups = { "windows.sanity" })
	public void tc4() {
		System.out.println("this is T4");
	}

	@Test(groups = { "macOS.regression" })
	public void tc5() {
		System.out.println("this is T5");
	}

}

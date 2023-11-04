package com.automation.day14_Oct_15_2023;

import org.testng.annotations.Test;

public class DataProvider_In_Another_Class {

	// How to connect @Test with @DataProvider which resides in another Class?
	// Answer: @Test (dataProvider = "nameOfThe@DataProvider", dataProviderClass =
	// nameOfTheClass@DataProvider.class)

	@Test(dataProvider = "dataCheck", dataProviderClass = DataProvider_Basics.class) // add dataProviderClass to add
																						// class where dataProvider
																						// resides in
	public void tryingToConnectWithDataProviderInAnotherClass(String browserName, String userName, String password,
			int mobile_number) {

	}
}

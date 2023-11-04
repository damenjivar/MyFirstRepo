package com.automation.day14_Oct_15_2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Basics {

	// DataProvider is an annotation in TestNG. It is represented as @DataProvider

	// Rule 1 - It returns a 2-D Object Array
	// Rule 2 - You have to pass the data in forms of rows and columns
	// Rule 3 - You have to connect the @Test case with the @DataProvider. There are
	// 2 ways to achieve this
	// 1st way - pass dataProvider = "nameOfTheMethodIn@DataProvider"
	// 2nd way - give a name to the @DataProvider and in @Test(dataProvider =
	// "nameOfThe@DataProvider")

	// Rule 4 - you have to parameterize the method in @Test with respect to number
	// of columns in @DataProvider.

	@Test(dataProvider = "dataCheck") // or you can just pass the method name (getData)
	public void loginTest(String browserName, String userName, String password, int mobile_number) {
		System.out.println(browserName + "---" + userName + "---" + password + "---" + mobile_number);
	}

	@DataProvider(name = "dataCheck")
	public Object[][] getData() { // change void to Object array after returning data Object array
		// We will design a 2-D Object Array
		Object[][] data = new Object[3][4];

		data[0][0] = "chrome"; // String
		data[0][1] = "username1"; // String
		data[0][2] = "password1"; // String
		data[0][3] = 98765432; // int

		data[1][0] = "firefox";
		data[1][1] = "username2";
		data[1][2] = "password2";
		data[1][3] = 98765433;

		data[2][0] = "edge";
		data[2][1] = "username3";
		data[2][2] = "password3";
		data[2][3] = 98765434;

		return data;

	}
}
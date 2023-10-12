package com.automation.day6.Sep_17_2023;

public class Xpath_Syntaxes {

	// syntax 1:
	// html[@attribute = 'value']

	// syntax 2:
	// html[@attribute1 = 'value1' and @attribute2 = 'value2']

	// syntax 3:
	// html[@attribute1 = 'value1' or @attribute2 = 'value2']

	// use syntax 2 and syntax 3 when syntax 1 does not return 1 of 1

	// syntax 4: is mostly used for links
	// html[text() = 'valueOfTheText']

	// syntax 5: uses a keyword known as contains. This works for both links as well
	// as other WebElements. Very popular way
	// html[contains(text(), 'valueOfTheText')] - this is used for links

	// syntax 6:
	// html[contains(@attribute, 'value')]

	// syntax 7:
	// html[starts-with(@attribute, 'startingValue')]

	// syntax 8:
	// html[ends-with(@attribute, 'endingValue')]
	

	public static void main(String[] args) {

	}

}
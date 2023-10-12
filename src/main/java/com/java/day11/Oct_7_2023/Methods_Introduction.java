package com.java.day11.Oct_7_2023;

public class Methods_Introduction {

	// Methods - independent units of execution. Logical units/factories of java
	// coding logic execution
	// What happens in a factory - you have raw material > brain > finished product
	// (return type)

	// How many types of methods are there?
	// 1. Concrete Method
	// 2. Unimplemented Method

	// How many methods have you worked on so far?
	// Both but you do not know that you have

	// What is a concrete method?
	// A method which has an access modifier, a return type, a body

	// Snytax of a concrete method

	public static void main(String[] args) {
		adding();
		joinThreeStrings();
		validateSalaryIncrease();

	}

	public static int adding() {
		// this is a method
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		return k;
	}

	public static String joinThreeStrings() {
		String a = "Hello";
		String b = "World";
		String c = "!";
		String d = a + b + c;
		System.out.println(d);
		return d;
	}

	public static boolean validateSalaryIncrease() {
		boolean salaryIncrease2022 = true;
		boolean salaryIncrease2023 = false;

		int performance = 95;
		int expectation = 100;

		if (performance < expectation) {
			System.out.println("no salary increase");
		} else {
			System.out.println("salary increased");
		}

		boolean expectationFrom2024 = false;
		return expectationFrom2024;
	}
}
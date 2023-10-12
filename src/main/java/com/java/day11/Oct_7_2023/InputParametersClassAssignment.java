package com.java.day11.Oct_7_2023;

public class InputParametersClassAssignment {

	// create 5 methods with 2,3,4,5,6 input parameters
	// Two methods should be of String type, 1 of int type, 1 of boolean type, 1 of
	// mix

	public static void main(String[] args) {
		addingTwoStrings("Hello ", "World!");
		addingThreeStrings("My ", "Dog ", "Ate");
		addingFourIntegers(1, 2, 3, 4);
		check("Automation", 10, true);
		healthyOrNot(true, true);
	}

	public static String addingTwoStrings(String S1, String S2) {
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
		// return should always be the last statement
	}

	public static String addingThreeStrings(String S1, String S2, String S3) {
		String S4 = S1 + S2 + S3;
		System.out.println(S4);
		return S4;

	}

	public static int addingFourIntegers(int a, int b, int c, int d) {
		int e = a + b + c + d;
		System.out.println(e);
		return e;

	}

	public static boolean healthyOrNot(boolean healthchecksession1, boolean healthchecksession2) {
		boolean healthcheckfinal = (healthchecksession1 == healthchecksession2);
		System.out.println("the health of the person is: " + healthcheckfinal);
		return healthcheckfinal;

	}

	public static String check(String S1, int i, boolean b1) {
		System.out.println(S1);
		return S1;
		// return i; not allowed, return is the last statement so a return after the
		// last statement is not allowed. Not allowed multiple return types, only 1 per
		// method

	}
}

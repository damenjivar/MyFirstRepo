package com.java.day18.Oct_29_2023;

public class Program5_Parsing {

	// Parsing means converting a String representation of a value into its
	// corresponding data type.

	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		stringToBoolean();
		stringToCharacter();
		stringToLong();
	}

// Integer Parsing
	public static void stringToInteger() {
		String price1 = "450";
		String price2 = "250";

		// Total price?
		// System.out.println(price1 + price2); // this won't work

		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println(p1 + p2);
	}

// Double Parsing
	public static void stringToDouble() {
		String price1 = "10.25";
		String price2 = "4.75";
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		System.out.println(p1 + p2);
	}

// Boolean Parsing
	public static void stringToBoolean() {
		String result1 = "true";
		String result2 = "false";
		boolean b1 = Boolean.parseBoolean(result1);
		boolean b2 = Boolean.parseBoolean(result2);
		System.out.println(b1 != b2);
	}

// Character Parsing
	public static void stringToCharacter() {
		String S1 = "a";
		String S2 = "b";

		char c1 = S1.charAt(0);
		char c2 = S2.charAt(0);
		System.out.println("stringToCharacter: " + c1 + c2);

	}

// Long Parsing
	public static void stringToLong() {
		String S1 = "10000000000";
		String S2 = "10000000000";
		long l1 = Long.parseLong(S1);
		long l2 = Long.parseLong(S2);
		System.out.println("stringToLong: " + (l1 + l2));
	}
}

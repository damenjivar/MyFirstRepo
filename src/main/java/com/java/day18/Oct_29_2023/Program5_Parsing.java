package com.java.day18.Oct_29_2023;

public class Program5_Parsing {

	public static void main(String[] args) {

	}

	public static void stringToBoolean() {
		String result1 = "true";
		String result2 = "false";

		boolean b1 = Boolean.parseBoolean(result1);
		boolean b2 = Boolean.parseBoolean(result2);

		System.out.println(b1 == b2);
	}
	
	public static void stringToCharacter() {
		String S1 = "a";
		String S2 = "_";
		
		char c=S1.charAt(0);
		
	}
	
	public static void stringToLong() {
		String long1 = "123456789";
		String long2 = "987654321";
		
		long l1 = Long.parseLong(long1);
		long l2 = Long.parseLong(long2);
		
		
	}
}

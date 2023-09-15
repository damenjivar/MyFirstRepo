package com.java.day3.Sep_9_2023_BasicsOfJava;

public class Concatenation_joining {

	public static void main(String[] args) {
		// + symbol represents concatenation or joining

		int a = 10;
		int b = 20;
		System.out.println(a + b); // concatenation
		String S1 = "hello";
		String S2 = "world";
		System.out.println(a + b + S1 + S2);
		System.out.println(S1 + a + b + S2);

		String assignment = "ThisyeartherewasverylesssnowinVirginia";
		String S3 = "This" + " " + "year" + " " + "there" + " " + "was" + " " + "very" + " " + "less" + " " + "snow"
				+ " " + "in" + " " + "Virginia";
		System.out.println(S3);
	}
}
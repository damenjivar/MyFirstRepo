package com.java.day9.Sep_30_2023;

public class Equals_vs_EqualsToMethods {

	public static void main(String[] args) {

		String S1 = new String("Java"); // 2 objects will be created, 1 in the Heap memory and the other in the SLP
		String S2 = new String("Java");

		System.out.println(S1 == S2);

		String S3 = "Hello";
		String S4 = "Hello";
		System.out.println(S3 == S4);
	}

}

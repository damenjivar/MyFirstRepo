package com.java.day9.Sep_30_2023;

public class String_Final {

	public static void main(String[] args) {

		final int i = 10;
		System.out.println(i);

		// String is immutable and cannot be changed like this
		String S1 = new String("Orange");
		S1.concat("Apple");
		System.out.println(S1); // Orange

		//String can be changed like this below
		S1 = S1.concat("Apple");
		System.out.println(S1);
	}
}

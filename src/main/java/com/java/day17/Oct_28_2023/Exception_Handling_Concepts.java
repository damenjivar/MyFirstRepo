package com.java.day17.Oct_28_2023;

public class Exception_Handling_Concepts {
	// An exception is an unwanted or unexpected event which occurs during the
	// execution of a program.

	// At runtime this exception disrupts the flow.

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5 / 0); // here an arithmeticException occured. So next lines of code will not be
									// printed.
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}
}

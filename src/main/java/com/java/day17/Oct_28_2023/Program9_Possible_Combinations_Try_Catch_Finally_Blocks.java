package com.java.day17.Oct_28_2023;

public class Program9_Possible_Combinations_Try_Catch_Finally_Blocks {

	// only try is not possible
	// only catch is not possible
	// only finally is not possible

	// try-catch is possible
	// try-finally is possible
	// try-catch-finally is possible

	// Can I have one try and multiple catches? YES but there are certain
	// conditions:
	// 1. If the catch blocks have the same Class name then it is not allowed.
	// 2. The first catch block cannot have the parent Class.
	// 3. The first catch block can have the Child Class and the second catch block
	// can have the Parent class.

	// Can a try block have try-catch block? YES
	// Can a catch block have try-catch block? YES
	// Can a finally block have try-catch block? YES
	// Can a finally block only have catch block? NO

	public static void main(String[] args) {

		try {
			try {
				int a = 10, b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {

				try {
					int a = 10, b = 0;
					int c = a / b;
					System.out.println(c);
				} catch (ArithmeticException e1) {
					e.printStackTrace();
				}
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
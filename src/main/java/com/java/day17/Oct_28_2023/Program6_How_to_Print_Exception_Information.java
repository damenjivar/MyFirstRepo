package com.java.day17.Oct_28_2023;

public class Program6_How_to_Print_Exception_Information {

	public static void main(String[] args) {

		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); // This will print Exception Name, description and stack
			// trace.
			System.out.println(e); // This will print Exception name and description but it will not print stack
									// trace.
			System.out.println(e.toString()); // This will print Exception name and description but it will not print
												// stack trace.
			System.out.println(e.getMessage()); // This will only print description
		}

	}

}

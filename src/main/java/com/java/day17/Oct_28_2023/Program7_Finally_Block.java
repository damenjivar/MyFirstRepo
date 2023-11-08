package com.java.day17.Oct_28_2023;

public class Program7_Finally_Block {

	// Finally block will execute no matter exception occurs or not.

	// You can execute finally block with only try block. You can choose not to use
	// try block but again if exception is there it will not be handled.

	// Only finally block is not possible.

	public static void main(String[] args) {

		case1(); // there was exception
		case2(); // there is no exception, code is clean. Will finally block be executed still?
					// YES
		case3();

	}

	public static void case1() { // there is an exception but still printing finally block

		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("no matter what this will be printed");
		}
	}

	public static void case2() { // clean code, finally block will still execute

		try {
			int a = 10, b = 2;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("no matter what this will be printed");
		}
	}

	public static void case3() { // clean code, finally block will still execute, try only without catch

		try {
			int a = 10, b = 2;
			int c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("no matter what this will be printed");
		}
	}

}

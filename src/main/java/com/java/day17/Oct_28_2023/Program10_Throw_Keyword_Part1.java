package com.java.day17.Oct_28_2023;

public class Program10_Throw_Keyword_Part1 {

	public static void main(String[] args) {
		Program10_Throw_Keyword_Part1 prog = new Program10_Throw_Keyword_Part1();
		prog.divideByZero();
	}

	public static void divideByZero() {
		int a = 10, b = 0;
		int c = a / b;
		System.out.println(c);
		throw new ArithmeticException(); // here the Exception Object will be created but the twist is programmer is
											// creating it manually.
		// throw keyword is basically used for Custom/User-defined Exceptions.
		// Note: avoid using it for pre-defined exceptions.
	}

	// divideByZero() will create an exception object and JVM will ask
	// divideByZero() if it can handle the exception.

	// divideByZero() will deny handling the exception because it cannot handle it,
	// so JVM will abruptly terminate divideByZero() method.

	// Now JVM will ask the caller method (main()) method if it will be able to
	// handle the exception or not.

	// main() method will also deny saying it cannot handle the exception, so JVM
	// will also terminate the main method.

	// JVM has no role but to transfer this to Default Exception Handler and DEH
	// will print the Objects.

}

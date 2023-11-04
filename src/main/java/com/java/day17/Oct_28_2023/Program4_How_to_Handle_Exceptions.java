package com.java.day17.Oct_28_2023;

public class Program4_How_to_Handle_Exceptions {

	public static void main(String[] args) {

		example1();
	}

	public static void example1() {
		// in this example we will work with a RunTime/unchecked exception
		int a = 10, b = 0;
		int c = a / b;
		System.out.println(c);
	}

	public static void explanation() {
		// Exception occurs at row number 13. This line int c=a/b is under example1()
		// method.

		// Example1() method will create an Object whenever it encounters an Exception
		// This Object has 3 things: 1. Exception name [it technically has the class
		// name].
		// 2. Description [what type of exception it is]
		// 3. StackTrace [which line and method has the exception]

		// This object will be passed to the JVM. JVM will check if it handles the
		// exception.
		// If JVM cannot handle the exception, it will pass it on to Default Exception
		// Handler.

		// But before JVM passes the object of DEH, it will abnormally terminate the
		// program.
		// DEH will print the exception.

		// How to handle this Exception manually?
		// by using 5 different keywords
		// 1. try
		// 2. catch
		// 3. finally
		// 4. throw
		// 5. throws

	}
}

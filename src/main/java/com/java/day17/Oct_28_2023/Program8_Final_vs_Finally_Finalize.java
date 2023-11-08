package com.java.day17.Oct_28_2023;

public class Program8_Final_vs_Finally_Finalize {

	// Final is a keyword.
	// Finally is also a keyword but it cannot be used without a block.
	// Finalize() is a method.

	// Final can be used with variable, method and class.
	// Final method CANNOT be over-ridden.

	// Finally block can be used with try block or try-catch block.
	// Finally block mostly holds cleanup code.

	// Finalize() method is used for overriding an Object.

	public static void main(String[] args) {

		final int a = 10; // When final is used for a variable that means the value of this variable
							// cannot be changed.

		// finally int b = 20; // Cannot do this without a block.

	}

	public static final void show() {
		System.out.println("this is show method which is final");
	}

	protected void finalize() throws Throwable {
		// Syntax of finalize() method.
		// This method can be over-ridden.
		// This method executes just before Garbage Collection.
		
		// If any object is about to be deleted, and if there is some resource related
		// to that object which is open, then the code inside finalize() method will
		// close the resource of that Object. So technically finalize() method also does
		// the cleanup job.
	}

}

class Test extends Program8_Final_vs_Finally_Finalize {

}

package com.java.day18.Oct_29_2023;

public class Program5 {

	// Use 3 - this() can be used to invoke current class constructor.

	Program5() {
		System.out.println("no argument constructor");
	}

	Program5(int i) {
		this(); // means current class constructor
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		// Program5 prog = new Program5();
		Program5 prog = new Program5(10);

	}
}

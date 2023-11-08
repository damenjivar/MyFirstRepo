package com.java.day18.Oct_29_2023;

public class Program1_This_Keyword {

	// This keyword is also a reference variable which refers to the object.

	int i; // instance variable

	void setValues(int i) {
		this.i = i; // When you are having the same naming convention for both instance and local
		// variable and you equal them, compiler gets confused.

		// This keyword refers to the current class instance variable.

		// Alone this will refer to the object.

		// But if we write this.i then it refers to the instance variable as instance
		// variables are part of the object itself.

	}

	void show() {
		System.out.println(i);
	}
}

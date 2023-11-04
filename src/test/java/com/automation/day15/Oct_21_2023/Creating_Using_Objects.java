package com.automation.day15.Oct_21_2023;

public class Creating_Using_Objects {

	// Name of the class is Creating_Using_Objects

	// What is an object?
	// Instance of a class.

	String name;
	int rollNumber;
	boolean promotion;

	public static void main(String[] args) {

		Creating_Using_Objects reference = new Creating_Using_Objects(); // this is how to create an object
		//this is the class name // reference // this is the object
		
		// how many objects of this Creating_Using_Objects class can we create?
		// innumerable, you just must change the reference variable

		Creating_Using_Objects reference1 = new Creating_Using_Objects();
		Creating_Using_Objects reference2 = new Creating_Using_Objects();
		Creating_Using_Objects reference3 = new Creating_Using_Objects();

		// java definition: object is collection of all non-static entities of the class

		logic2();
		reference.logic1();
		reference.logic3();
		reference.name = "John";
		reference.rollNumber = 101;
		reference.promotion = true;

		reference.logic2(); // Will it work? Yes it will work.
		// We can also use the object reference to call static entities of the class.
		// But is it recommended? No, because static entities can be called directly or
		// with the help of class name. You do not need to use object
	}

	public void logic1() { // this is a non-static entity
		System.out.println("the grass is green");
	}

	public static void logic2() { // this is a static entity
		System.out.println("this is logic2 static method");
	}

	public void logic3() { // this is a non-static entity

	}
}
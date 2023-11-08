package com.java.day17.Oct_28_2023;

import java.util.Scanner;

public class Scanner_Concept {

	// Scanner class is a pre-defined class in java under java.util package
	// use of scanner class - it helps to acknowledge user input
	// scanner class has a lot of inbuilt methods - next(), nextInt(), nextLong()

	public static void main(String[] args) {

		// Create the Object of Scanner Class and you have to pass the System.in as the
		// input parameter inside the parameter.
		Scanner scan = new Scanner(System.in);

		System.out.println("enter name");
		String name = scan.next();

		System.out.println("enter gender");
		// M or F - one entity means you can store it as a character
		char gender = scan.next().charAt(0);

		System.out.println("enter age");
		int age = scan.nextInt();

		System.out.println("enter phone number");
		long phoneNumber = scan.nextLong();

		System.out.println("the name of the person is: " + name);
		System.out.println("the gender of the person is: " + gender);
		System.out.println("the age of the person is: " + age);
		System.out.println("the phone number of the person is: " + phoneNumber);
	}
}
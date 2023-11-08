package com.java.day17.Oct_28_2023;

import java.util.Scanner;

public class Scanner_Calculator {

	public static void main(String[] args) {
		// I will give you two numbers
		// add, subtract, multiply, divide

		Scanner scan = new Scanner(System.in);

		System.out.println("enter first number");
		int number1 = scan.nextInt();

		System.out.println("enter second number");
		int number2 = scan.nextInt();

		System.out.println("select mathematical operation ( + , - , * , / )");
		String mathematicalOperation = scan.next();

		// How many valid cases are there? There are 4 which are + - * /
		// Whatever mathematical operation you perform you will get a result. That
		// result will be an integer.

		int result;

		switch (mathematicalOperation) {
		case "+":
			result = number1 + number2;
			System.out.println("the sum of two numbers is: " + result);
			break;

		case "-":
			result = number1 - number2;
			System.out.println("the difference of two numbers is: " + result);
			break;

		case "*":
			result = number1 * number2;
			System.out.println("the product of two numbers is: " + result);

		case "/":
			result = number1 / number2;
			System.out.println("the quotient of two numbers is: " + result);
			break;

		default:
			System.out.println("invalid mathematical operation");
			break;
		}
	}

}

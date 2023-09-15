package com.java.day4.Sep_10_2023_ControlStatements;

public class Control_Statements {

	public static void main(String[] args) {
		ifControlStatement();
		ifElseControlStatement();
		ifElseIfControlStatement();
		ifElseIfControlStatementAssignment();
		determineWhetherThisNumberIsEvenOrOdd();
	}

	public static void ifControlStatement() {
		if (200 > 100) {
			System.out.println("my logic is correct");
		}
	}

	public static void ifElseControlStatement() {
		if (2 == 4) {
			System.out.println("my condition is true");
		} else {
			System.out.println("the above condition is dead code");
		}
	}

	public static void ifElseIfControlStatement() {
		int i = 1;
		int j = 2;
		int k = 3;
		// I want to determine the largest of these 3 numbers
		if (i > j && i > k) {
			System.out.println("i is the largest");
		} else if (j > i && j > k) {
			System.out.println("j is the greatest");
		} else {
			System.out.println("k is the greatest: " + k);
		}

	}

	public static void ifElseIfControlStatementAssignment() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		if (a > b && a > c && a > d && a > e) {
			System.out.println("a is the greatest");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("b is the greatest");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("c is the greatest");
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println("d is the greatest");
		} else {
			System.out.println("e is the greatest");
		}
	}

	public static void determineWhetherThisNumberIsEvenOrOdd() {
		int i = 101;
		int j = 100;
		int k = 200;

		if (i % 2 == 0) {
			System.out.println("i is even");
		} else {
			System.out.println("i is odd");
		}
		if (j % 2 == 0) {
			System.out.println("j is even");
		} else {
			System.out.println("j is odd");
		}
		if (k % 2 == 0) {
			System.out.println("k is even");
		} else {
			System.out.println("k is odd");
		}
	}
}

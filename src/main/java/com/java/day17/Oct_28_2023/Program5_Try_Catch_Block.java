package com.java.day17.Oct_28_2023;

public class Program5_Try_Catch_Block {

	public static void main(String[] args) {
		example1();
		example2();
		tryCodeIsNotRiskySoWhatHappensToCatchBlock();
	}

	public static void example1() {
		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("the exception has been handled");
		}
	}

	public static void example2() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			System.out.println("9");
			System.out.println("10");
		}
	}

	public static void tryCodeIsNotRiskySoWhatHappensToCatchBlock() {
		try {
			int a = 10, b = 2;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("there is no problem in the try block or there is no risk, still I am using try catch");
		}
	}
}
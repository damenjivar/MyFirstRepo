package com.java.day5.Sep_16_2023;

public class ForLoop_Assignment {

	public static void main(String[] args) {
		print1to100();
		print100to1();
		print5to495InMultiplesOf10AndAddThoseMultiples();
		printFirst20MultiplesOf9andAddThoseMultiples();
		printFirst20MultiplesOf9AndAddThoseMultiples();
	}

	public static void print1to100() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
	}

	public static void print100to1() {
		int sum = 0;
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("the total sum of 100 to 1 is: " + sum);
	}

	public static void print5to495InMultiplesOf10AndAddThoseMultiples() {
		int sum = 0;
		for (int i = 5; i <= 495; i = i + 10) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("the sum is: " + sum);
	}

	public static void printFirst20MultiplesOf9andAddThoseMultiples() {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			int multiple = 9 * i;
			System.out.println(multiple + " ");
			sum += multiple;
		}
		System.out.println("the sum is: " + sum);
	}

	public static void printFirst20MultiplesOf9AndAddThoseMultiples() {
		int sum = 0;
		for (int i = 9; i <= 20 * 9; i = i + 9) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("the sum is: " + sum);
	}
}
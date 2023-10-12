package com.java.day5.Sep_16_2023;

public class WhileLoop_ClassAssignment {

	public static void main(String[] args) {
		print1to10();
		print10to1();
		print1to10AndAdd1to10();
		print5to100InTheMultiplesOf5AndAddThoseMultiples();
		print100to5InTheDecreasingMultiplesOf5AndAddThoseMultiples();
	}

	public static void print1to10() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
	}

	public static void print10to1() {
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println();
	}

	public static void print1to10AndAdd1to10() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println(i);
			sum = sum + i;
			i++;
		}
		System.out.println("the total sum of 1 to 10 is: " + sum);
		System.out.println();
	}

	public static void print5to100InTheMultiplesOf5AndAddThoseMultiples() {
		int i = 5;
		int sum = 0;
		while (i <= 100) {
			System.out.println(i);
			sum = sum + i;
			i = i + 5;
		}
		System.out.println("the sum of the multiples are: " + sum);
		System.out.println();
	}

	public static void print100to5InTheDecreasingMultiplesOf5AndAddThoseMultiples() {
		int i = 100;
		int sum = 0;
		while (i >= 5) {
			System.out.println(i);
			sum = sum + i;
			i = i - 5;
		}
		System.out.println("the multiples' sum is: " + sum);
	}
}
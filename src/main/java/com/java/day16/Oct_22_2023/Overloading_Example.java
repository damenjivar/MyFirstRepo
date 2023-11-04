package com.java.day16.Oct_22_2023;

public class Overloading_Example {

	public static void main(String[] args) {
		Overloading_Example ref = new Overloading_Example();
		System.out.println(ref.add());
		System.out.println(ref.add(10, 20));
		System.out.println(ref.add(0.1, 0.2));
		System.out.println(ref.add("Hello", "World"));
		System.out.println(ref.add(1, 2, 3));
	}

	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public double add(double a, double b) {
		double c = a + b;
		return c;
	}

	public String add(String a, String b) {
		String c = a + b;
		return c;
	}

	public int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
}
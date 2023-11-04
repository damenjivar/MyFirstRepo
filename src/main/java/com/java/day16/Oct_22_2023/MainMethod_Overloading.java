package com.java.day16.Oct_22_2023;

public class MainMethod_Overloading {

	public static void main(String[] args) {
		main(10);
		main(args = new String[3], args = new String[4]);
	}

	// can the main method be overloaded? YES

	public static void main(int i) {
		System.out.println(200 + 200);
	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("this is the overloaded main method with two String[] args");
	}
}

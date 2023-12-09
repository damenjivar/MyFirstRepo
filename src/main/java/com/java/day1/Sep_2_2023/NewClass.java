package com.java.day1.Sep_2_2023;

public class NewClass {

	public static void main(String[] args) {

		// create an array of objects to hold different types of values
		Object[] mixedArray = { 1, 'a', "Hello", 3.14 };
		// Access and print elements from the mixed array
		for (Object element : mixedArray) {
			System.out.println(element);
		}

	}
}

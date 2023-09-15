package com.java.day3.Sep_9_2023_BasicsOfJava;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {

		// ++ means +1
		// -- means -1

		// post increment operator
		// pre increment operator

		// post decrement operator
		// pre decrement operator

		int a = 1;

		a++; // this is post increment operator, after the variable ++ is used
		++a; // this is pre increment operator, before the variable ++ is used
		a--; // this is post decrement operator, after the variable
		--a; // this is pre decrement operator, before the variable

		int i = 1; // latest value of i is 1
		int j = i++ + ++i;
		// j = 1 + 3 = 4
		// i =2 , 3

		System.out.println(i); // 3
		System.out.println(j); // 4
	}
}
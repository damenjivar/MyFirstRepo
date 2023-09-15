package com.java.day3.Sep_9_2023_BasicsOfJava;

public class Assignment_Inc_Dec_Operators {

	public static void main(String[] args) {
		int a = 2;
		int b = a-- - --a + a++ + --a + ++a;
		// b = 2 - 0 + 0 + 0 + 1
		// a = 1, 0, 1, 0, 1

		System.out.println(a); // 1
		System.out.println(b); // 3

		int i = 10;
		int j = i--;
		int k=--i + j++;
		int l= i-- - --k - --j + j++;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
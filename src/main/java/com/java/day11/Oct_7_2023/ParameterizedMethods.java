package com.java.day11.Oct_7_2023;

public class ParameterizedMethods {

	public static void main(String[] args) {
		joiningTwoStrings("Monkey", "Donkey");
		addTwoNumbers(1, 3);
	}
	
	//an example of non-parameterized method
	public static void addingTwoIntegers() {
		
	}
	
	//an example of parameterized method
	public static String joiningTwoStrings(String S1, String S2) { //passing parameters here
		String S3 = S1+S2;
		System.out.println(S3);
		return S3;
	}
	
	public static int addTwoNumbers(int i, int j) {
		int k = 1+j;
		System.out.println(k);
		return k;
	}
}

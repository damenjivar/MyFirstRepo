package com.java.day9.Sep_30_2023;

public class PasswordProtection {

	// will you save your password in a Char Array or will you save your password in
	// String
	
	//Character Array is safer than String for passwords

	public static void main(String[] args) {

		String S1 = new String("Password");
		System.out.println("the retrieved value of password is: " + S1);

		char[] c1 = { 'P', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		System.out.println("the retrieved value of password is: " + c1);
	}
}

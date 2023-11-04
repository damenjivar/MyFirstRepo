package com.java.day17.Oct_28_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program3_Checked_vs_Unchecked_Exceptions {

	// what are CompileTime Exceptions and what are RunTime Exceptions?

	// Exceptions ALWAYS occur at Runtime. Exceptions NEVER occur at CompileTime.

	// CompileTime(Checked) Exceptions are the exceptions which can be handled or
	// warned by the Compiler at Compile time.

	// RunTime(unchecked) Exceptions are the exceptions which CANNOT be handled by
	// the compiler at Compile Time.

	public static void main(String[] args) {
		FileNotFoundExceptionValidation();
		classNotFoundExceptionValidation();
		arithmeticExceptionValidation();
	}

	public static void FileNotFoundExceptionValidation() {
		// my intention is to handle a particular file in my laptop

		try {
			FileInputStream ip = new FileInputStream("Desktop//abc");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void classNotFoundExceptionValidation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void arithmeticExceptionValidation() {
		int a = 10, b = 0;
		int c = a / b; // here lies the exception ... is compiler giving you a warning? No, this is an
						// example of RunTime exception
		System.out.println(c);
	}
}
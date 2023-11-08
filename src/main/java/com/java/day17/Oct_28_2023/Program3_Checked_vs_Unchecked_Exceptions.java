package com.java.day17.Oct_28_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program3_Checked_vs_Unchecked_Exceptions {

	// What are CompileTime Exceptions and what are RunTime Exceptions?

	// Exceptions ALWAYS occur at RunTime. Exceptions NEVER occur at CompileTime.

	// CompileTime(Checked) Exceptions are the exceptions which can be handled or
	// warned by the Compiler at Compile Time.

	// RunTime(Unchecked) Exceptions are the exceptions which cannot be handled by
	// the compiler at Compile Time.

	// runtime exceptions are exceptions that are handled during runtime

	public static void main(String[] args) {
		fileNotFoundExceptionValidation();
		classNotFoundExceptionValidation();
		arithmeticExceptionValidation();
	}

//compileTime exception
	public static void fileNotFoundExceptionValidation() {
		// my intention is to handled a particular file in my laptop
		try {
			FileInputStream ip = new FileInputStream("Desktop/abc");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

//compileTime exception
	public static void classNotFoundExceptionValidation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//runTime exception
	public static void arithmeticExceptionValidation() {
		int a = 10;
		int b = 0;
		int c = a / b; // here lies the exception, is compiler giving you a warning?
		System.out.println(c);
	}
}
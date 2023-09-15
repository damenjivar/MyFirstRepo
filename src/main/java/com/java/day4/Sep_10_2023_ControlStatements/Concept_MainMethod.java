package com.java.day4.Sep_10_2023_ControlStatements;

public class Concept_MainMethod {

	public static void main(String[] args) {
		// main method will be the center of execution
		// main method will always be static because it is related at a class level
		// main method can be overloaded
		// main method will have the public access modifier
		// swapping public and static keywords will still execute main method

		System.out.println("this is the main method");
		logic1(); // static method calling
		
		Concept_MainMethod ref = new Concept_MainMethod(); // non-static method calling
		ref.logic2();
	}

	public static void logic1() {
		System.out.println("we are learning java");
	}

	public void logic2() {
		System.out.println(23 + 37);
	}
}

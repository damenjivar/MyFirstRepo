package com.java.day16.Oct_22_2023;

public class Student {

	public static void main(String[] args) {

		Student student = new Student();
		student.name();
		student.name(10);
		student.name(10, 11);
		student.name("John");
		student.name("Hello", "World");
		student.name(new StringBuffer("Thomas"));
		student.name(new StringBuilder("Tom"));

	}

	public void name() {
		System.out.println("this is a simple no argument/parameter method");
	}

	public void name(int i) {
		System.out.println("this is a simple method having one int datatype argument/parameter");
	}

	public void name(int j, int i) {
		System.out.println("this is a simple method having two int datatype argument/parameter");
	}

	public void name(String S) {
		System.out.println("this is a simple method having one String type argument/parameter");
	}

	public void name(String S1, String S2) {
		System.out.println("this is a simple method having two String type argument/parameter");
	}

	public void name(StringBuffer S) {
		System.out.println("this is a simple method having one StringBuffer type argument/parameter");
	}

	public void name(StringBuilder S) {
		System.out.println("this is a simple method having one StringBuilder type argument/parameter");
	}

}

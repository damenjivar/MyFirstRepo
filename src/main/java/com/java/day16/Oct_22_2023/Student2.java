package com.java.day16.Oct_22_2023;

public abstract class Student2 {

	String name;
	int age;
	
	//abstract(undefined/unimplemented)
	//how do you create an abstract method?
	//answer: 1. by using the Abstract keyword
	//2. by not creating the method body
	
	public abstract void studentMarksheet();
	
	public abstract void studentPlayground();
	
	public void studentLibrary() {
		System.out.println("this is a concrete/simple/normal/regular method");
	}
}

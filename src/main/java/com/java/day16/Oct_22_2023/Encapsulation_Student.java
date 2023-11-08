package com.java.day16.Oct_22_2023;

public class Encapsulation_Student {

	private String name; //data hiding
	private int age; //data hiding
	
	//setter method
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	//getter method
	public String getData1() {
		return name;
	}
	//getter method
	public int getData2() {
		return age;
	}
}

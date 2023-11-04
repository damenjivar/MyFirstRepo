package com.java.day16.Oct_22_2023;

public class Parent extends Grandparent {

	private String name = "John";

	public Parent() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
	}

	private void cashBox() {
		System.out.println("parent's private cash box");
	}

	public void bankBalance() {
		System.out.println("this is parent's bank balance");
	}

	public void farmHouse() {
		System.out.println("this is parent's farmhouse");
	}
}

//nested class
class Uncle extends Parent {

	public void gameZone() {
		System.out.println("uncle's gamezone");
	}
}
//HW: how can a child class inherit a nested class from the parent class
package com.java.day18.Oct_29_2023;

public class Child_Super extends Parent_Super {

	int a = 20;
	
	Child_Super() {
		super();
	}

	void show(int a) {
		System.out.println(a); //30
		System.out.println(this.a); //20 this goes to instance variable above
		System.out.println(super.a); //10 this goes to the parent class
		super.takeAway(); //you can directly call parent class here
	}

	public static void main(String[] args) {

		Child_Super child = new Child_Super();
		child.show(30);
	}

}
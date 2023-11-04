package com.java.day16.Oct_22_2023;

public class TestExecution {

	public static void main(String[] args) {
		// I will create the Object of the Child class
		Child child = new Child(); //30
		child.superBike();
		child.superCar();
		child.bankBalance();
		child.farmHouse();
		child.creditUnion();
		child.politicalOffice();

		//siblings cannot inherit from other siblings
		Child2 child2 = new Child2(); //30
		child2.guitar();
		child2.bar();
		child2.farmHouse();
		child2.creditUnion();
		child2.bankBalance();
		child2.farmHouse();

		// I will create the Object of the Parent class
		Parent parent = new Parent(); //30
		parent.bankBalance();
		parent.farmHouse();
		parent.creditUnion();
		parent.politicalOffice();

	}

}

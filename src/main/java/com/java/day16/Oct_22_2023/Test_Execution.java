package com.java.day16.Oct_22_2023;

public class Test_Execution extends SecretMoney implements Introduction, Conclusion {

	public static void main(String[] args) {
		// we cannot create the Object of Abstract Class
		// Interface is more Abstract than Abstract Class. So, interface's object
		// creation is impossible

		Introduction intro = new Test_Execution(); // use the Interface reference to refer to the Object of Implementing
													// Class
		// how is this concept used in Automation?
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tearDown1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tearDown2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void blackMoney() {
		// TODO Auto-generated method stub

	}
}

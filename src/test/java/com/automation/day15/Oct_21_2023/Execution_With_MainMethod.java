package com.automation.day15.Oct_21_2023;

public class Execution_With_MainMethod {

	public static void main(String[] args) {
		// you intend to execute the logic of another Dependent class

		Dependent_WithoutMainMethod.red();

		// can i create the object of another class inside this class? YES
		Dependent_WithoutMainMethod ref = new Dependent_WithoutMainMethod();
		ref.pink(); // for non-static entities you must create the object of that class and use the
					// reference to call that method from another class.

		Execution_With_MainMethod ref1 = new Execution_With_MainMethod();
		ref1.hello1();
		ref1.hello2();
		ref1.hello3();

	}

	public void hello1() {
		System.out.println("this is hello1 non static method inside execution class");
	}

	public void hello2() {
		System.out.println("this is hello2 non static method inside execution class");
	}

	public void hello3() {
		System.out.println("this is hello3 non static method inside execution class");
	}
}
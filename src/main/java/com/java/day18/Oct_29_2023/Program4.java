package com.java.day18.Oct_29_2023;

public class Program4 {

	// Use 2 - this keyword can be used to invoke current class method(implicitly).

	void display() {
		System.out.println("hello");
	}

	void show() {
		this.display();
		// Even if you do not use this keyword, compiler automatically add this keyword
		// while invoking the method.
		// Hence this.display() or display() will work the same.
	}

	public static void main(String[] args) {
		Program4 prog = new Program4();
		prog.show();
	}
}

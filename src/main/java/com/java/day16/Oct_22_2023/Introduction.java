package com.java.day16.Oct_22_2023;

public interface Introduction {

	int i = 10;
	String name = "John";

	public abstract void display();

	void display1();

	abstract void display2();

	public void display3();

	// interface automatically makes it public static final regardless

	default void check() {

	}

	private void check1() {

	}

	public static void check2() {

	}
}
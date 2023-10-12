package com.java.day5.Sep_16_2023;

public class ForLoop {
	// while loop
	// you initialized something
	// then you gave an expression/condition in the whileBody
	// wrote your logic
	// incremented or decremented as per your logic

	// vs

	// for Loop
	// (the initialization ; condition ; inc/dec) {
	// logic }

	public static void main(String[] args) {
		
		//   seq 1 ->   seq 2     seq 4
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello world"); //logic inside the body is seq 3
		}
	}
}
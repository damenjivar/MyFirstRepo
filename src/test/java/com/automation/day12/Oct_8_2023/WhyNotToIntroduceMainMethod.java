package com.automation.day12.Oct_8_2023;

import org.testng.annotations.Test;

public class WhyNotToIntroduceMainMethod {

	public static void main(String[] args) {
		System.out.println("this is the main method");
	}
	
	@Test
	public void executionEngine() {
		System.out.println("this is execution engine of TestNG");
	}
}

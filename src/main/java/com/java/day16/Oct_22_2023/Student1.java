package com.java.day16.Oct_22_2023;

public class Student1 extends School {

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.education();
		student.mandatoryFee(200);
	}

	public void education() {
		System.out.println("this is child's class education method");
	}

	public void mandatoryFee(int i) {
		System.out.println("this is child's class mandatory fee with int parameter");
	}
}

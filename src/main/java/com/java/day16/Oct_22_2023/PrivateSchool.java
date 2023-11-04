package com.java.day16.Oct_22_2023;

public class PrivateSchool extends Student2 {

	public static void main(String[] args) {
		PrivateSchool ps = new PrivateSchool();
		System.out.println(ps.age = 20);
		System.out.println(ps.name = "John");

		// We cannot create the Object of Abstract Class
		//School school = new School() // this is not happening
		
		//We will use the Parent Class to refer the Object of Child Class
		Student2 ref = new PrivateSchool();
		//Student is the parent abstract Class
		//ref is the reference
		//new PrivateSchool() is the Object of Child Class
		
		//A parent class reference is pointing towards the Object of Child Class
		ref.studentLibrary();
		ref.studentMarksheet();
		ref.studentPlayground();
	}

	public void privateSchoolCourseCurriculum() {
		System.out.println("this is private school's course curriculum");
	}

	public void privateSchoolAssembly() {
		System.out.println("this is private school's prayer hall and assembly");
	}

	@Override
	public void studentMarksheet() {
		System.out.println("write your own logic");
	}

	@Override
	public void studentPlayground() {
		System.out.println("write your own logic");
	}
}

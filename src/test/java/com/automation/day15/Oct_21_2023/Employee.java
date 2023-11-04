package com.automation.day15.Oct_21_2023;

public class Employee {

	String name; // default value of string is null
	int age; // default value of int is zero
	boolean promotion; // default value of a boolean is false
	String classRoomEnrollment;
	String primarySubject;

	// this is a constructor because it does not have a return type
	public Employee(String name, int age, boolean promotion, String classRoomEnrollment, String primarySubject) {
		this.name = name;
		this.age = age;
		this.promotion = promotion;
		this.classRoomEnrollment = classRoomEnrollment;
		this.primarySubject = primarySubject;

		//use 'this' keyword to instantiate global instance variables into local variables
	}

	public static void main(String[] args) {

		// Employee employee = new Employee(); // object has been created
		// a constructor is invoked the moment object is created. Employee() is the
		// constructor

		Employee employee1 = new Employee("Tom", 10, true, "4B", "Science");
		// you created the object and passed the parameters (Student info in the
		// constructor)
		// but have you manually invoked the constructor yet? NO
		System.out.println(employee1.name + "---" + employee1.age + "---" + employee1.promotion + "---"
				+ employee1.classRoomEnrollment + "---" + employee1.primarySubject);

		Employee employee2 = new Employee("John", 10, true, "4B", "Science");
		// you created the object and passed the parameters (Student info in the
		// constructor)
		// but have you manually invoked the constructor yet? NO
		System.out.println(employee2.name + "---" + employee2.age + "---" + employee2.promotion + "---"
				+ employee2.classRoomEnrollment + "---" + employee2.primarySubject);

		
	}
}
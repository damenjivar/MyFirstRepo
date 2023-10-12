package com.java.day9.Sep_30_2023;

public class Memory_Locations_In_Java {

	// 5 memory locations in Java

	// 1. Heap Memory [String Literal Pool]

	// 2. Stack Memory

	// 3. PC Register

	// 4. Method Area

	// 5. Native Method Area

	// What is Java? It is an Object Oriented Programming Language.

	// Objects are physical entities. They occupy memory space.
	// One way to create Object in Java is by the help of new keyword
	
	public static void main(String[] args) {

		Memory_Locations_In_Java memorylocations = new Memory_Locations_In_Java();

		String S1 = "HelloWorld"; //String Literal Pool or String Constant Pool
		String S2 = new String("Ocean is blue");
	}

}

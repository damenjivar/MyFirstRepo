package com.java.day9.Sep_30_2023;

public class MemoryLocations_InDepthUnderstanding {

	public static void main(String[] args) {

		String S = new String();
		// I am creating a String Object using new keyword and I am not passing any
		// literal
		// 1 Object will be created in the Heap Memory

		String S1 = new String("Java");
		// Here 2 objects are created
		// 1 object in Heap Memory because of new keyword
		// Another object in the String Literal Pool memory because of the literal
		// "Java" passed

		String S2 = "C++";
		// here 1 object will be directly created inside the SLP memory and it is
		// referred to by S2

		// What is the difference between

		// String S1 = new String("Java") v/s String S2 = "C++"

		// String S1
		// 2 objects are created - Heap and SLP
		// heavy
		// this one is not recommended in case of Strings

		// String S2
		// 1 object is created in SLP
		// light
		// recommended in case of Strings

		// Interview question
		// If you want to make a String Object will you choose String S1 = "Java"; or
		// will you choose String S1 = new String"Java");
		// answer: String S1 = "Java";
		
	}

}

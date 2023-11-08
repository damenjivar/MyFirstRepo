package com.java.day20.Nov_5_2023;

import java.util.ArrayList;
import java.util.HashSet;

public class Class3_What_is_Collection_Framework {

	// collection is a pre-defined interface
	// collection (as a general understanding in java) - is a single entity or an
	// object which can store multiple data
	// framework - represents a library

	// collection framework - it is a set of pre-defined classes, interfaces, and
	// methods which is used to store multiple data

	// collection framework contains 2 main packages
	// java.util.Collection - we can store the data directly here
	// java.util.Map - here we store the data in key-value pair

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Selenium");
		al.add(true);
		al.add('c');

		HashSet hs = new HashSet();
		hs.add("python");
		hs.add(false);
		hs.add(20);
		hs.add('d');

		// al and hs - both are collection objections which are storing objects in
		// itself

		// what is the difference between the two collection objects?
		// *objects have different properties. Internally working principle is different.
		// This is the most important aspect in interviews.

	}

}

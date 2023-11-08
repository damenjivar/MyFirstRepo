package com.java.day20.Nov_5_2023;

import java.util.ArrayList;

public class Class2_Arrays_vs_Collections_Framework {

	public static void main(String[] args) {

	}

	// difference 1 - arrays can store primitive and non-primitive type of data but
	// collection framework can only store non-primitive type of data (objects)
	public static void difference1() {
		int[] a = { 1, 2, 3, 4, 5 };

		Class2_Arrays_vs_Collections_Framework obj1 = new Class2_Arrays_vs_Collections_Framework();
		Class2_Arrays_vs_Collections_Framework obj2 = new Class2_Arrays_vs_Collections_Framework();
		Class2_Arrays_vs_Collections_Framework obj3 = new Class2_Arrays_vs_Collections_Framework();
		Class2_Arrays_vs_Collections_Framework obj4 = new Class2_Arrays_vs_Collections_Framework();
		Class2_Arrays_vs_Collections_Framework obj5 = new Class2_Arrays_vs_Collections_Framework();

		Class2_Arrays_vs_Collections_Framework[] ref = { obj1, obj2, obj3, obj4, obj5 };

		// vs

		ArrayList al = new ArrayList();
		al.add(10); // 10 is an Integer object
		al.add("java"); //
		al.add('c');
		al.add(obj1);

	}

	// difference 2 - arrays can store only homogeneous type of data except in some
	// cases like int as it can be type-casted automatically but collection
	// framework can store heterogeneous type of data.

	public static void difference2() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] a1 = { 1, 2, 'c', 3, 4, 5 }; // int array can store character as well
		// int[] a2 = {1,2,3,4.4,5}; not allowed double

		boolean[] b1 = { true, false, 1 < 2, 2 > 4 };
		// boolean[] b2 = {1,2,3,4}; not allowed, must be true or false

		Class2_Arrays_vs_Collections_Framework obj2 = new Class2_Arrays_vs_Collections_Framework();

		ArrayList al = new ArrayList();
		al.add(10); // 10 is an Integer object
		al.add("java"); //
		al.add('c');
		al.add(obj2);

	}

	// difference 3 - arrays size is fixed. We cannot increase/decrease size of
	// array during runtime but we can increase/decrease the size of collection
	// framework entities during runtime.

	// difference 4 - arrays are inbuilt features of java, so algorithms have to be
	// developed by the developer but collection framework is an API which means
	// there are already pre-defined classes and interfaces and methods inside the
	// API. We can directly use it.

}

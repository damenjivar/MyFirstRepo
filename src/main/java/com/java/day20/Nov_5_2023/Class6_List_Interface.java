package com.java.day20.Nov_5_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class6_List_Interface {

	// list interface is the child of collection interface
	// list stores data in an indexing fashion or index based data structure (array)
	// List has the following implementing classes - arrayList, linkedList, Vector,
	// Stack

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		list.add("world");

		// traversing list through interface

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

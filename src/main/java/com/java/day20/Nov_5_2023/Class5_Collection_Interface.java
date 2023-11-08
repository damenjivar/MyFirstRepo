package com.java.day20.Nov_5_2023;

import java.util.ArrayList;

public class Class5_Collection_Interface {

	// Collection - this is the root interface in the collection hierarchy

	// what do we need to learn in Collection interface?
	// The methods which are present/defined in the Collection interface

	// add()
	// addAll()
	// clear()
	// contains()
	// containsAll()
	// equals()
	// hashCode()
	// isEmpty()
	// remove()
	// removeAll()
	// size()

	// WebDriver is an interface

	// WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);

		ArrayList al1 = new ArrayList();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		System.out.println(al1);
		
		al.addAll(al1);
		System.out.println(al);
	}
}
























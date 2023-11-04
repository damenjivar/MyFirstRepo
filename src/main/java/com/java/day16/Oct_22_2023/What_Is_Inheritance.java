package com.java.day16.Oct_22_2023;

public class What_Is_Inheritance {

	// Inheritance is inheriting the properties of parent class into child class.
	// Inheritance in java is a mechanism in which one object acquires all the
	// properties and behaviors of a parent object.

	// Inheritance represents the IS-A relationship which is also known as
	// parent-child relationship.
	// For example:
	// Dog IS-A Animal
	// Car IS-A Vehicle
	// Surgeon IS-A Doctor

	// What are the advantages of inheritance?
	// 1. Code reusability
	// 2. It promotes runtime polymorphism by allowing method overriding

	// What are the disadvantages of inheritance?
	// 1. The parent and child classes get tightly coupled

	// Inheritance is achieved by using the 'extends' keyword

	// What does not take part in inheritance?
	// 1. Constructors
	// A child class can inherit all the members (fields, methods, nested classes)
	// from its parent class. Constructors are not members, so they cannot be
	// inherited by the child class. But the constructor of the parent class can be
	// invoked from the child Class.

	// 2. Private members
	// A child class does not inherit the private members of its parent class.
	// However if the parent class has public or protected methods (like getters and
	// setters) for accessing its private fields, these can be used by the Child
	// Class.

	// Note: there can only be 1 parent class, because Java does not support
	// multiple inheritance.

	// Parent class is also known as super class. Child class is also known as sub
	// class.

	// Types of inheritance in Java
	// 1. Single inheritance - One child class extends one parent class
	// 2. Multilevel inheritance - grandparent is the parent of ParentClass and
	// ParentClass is the parent of ChildClass. So ChildClass extends Grandparent
	// indirectly from derived class.

	// 3. Hierarchical inheritance - one parent class is inherited by multiple child
	// classes
}

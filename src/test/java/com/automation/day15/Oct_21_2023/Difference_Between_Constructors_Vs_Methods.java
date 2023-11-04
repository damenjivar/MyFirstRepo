package com.automation.day15.Oct_21_2023;

public class Difference_Between_Constructors_Vs_Methods {

	// Difference 1. Constructor has to have the name of the class. Methods can have
	// any name.
	// Difference 2. Constructors are invoked when an object is created. That is not
	// the case with Methods which are user-defined.
	// Difference 3. Constructors do not have a return type but methods have to have
	// a return type otherwise it won't work.
	// Difference 4. Constructors can only be overloaded but cannot be overridden.
	// Methods can be overloaded or overridden.
	// Difference 5. Constructors cannot be made static but methods can be static

	public Difference_Between_Constructors_Vs_Methods() {
		// you cannot make a constructor static, this is a constructor
	}
}

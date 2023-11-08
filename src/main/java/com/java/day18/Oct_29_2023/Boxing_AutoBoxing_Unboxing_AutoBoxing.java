package com.java.day18.Oct_29_2023;

public class Boxing_AutoBoxing_Unboxing_AutoBoxing {

	// what is the parent class of all classes? Object
	// direct parent class of Character and Boolean Wrapper Class --> Object class
	// direct parent of other Wrapper Classes --> Number class

	// Boxing - conversion of primitive data type to Wrapper Class Object.
	// Unboxing - conversion of Wrapper Class Object to primitive data type.

	// HW - try boxing and unboxing for other primitive data types and wrapper
	// classes

	public static void main(String[] args) {
		intBoxing();
		intAutoBoxing();
		integerUnboxing();
		integerAutoUnboxing();
		byteBoxing();
		byteAutoBoxing();
		byteUnboxing();
		byteAutoUnboxing();

		floatBoxing();
		floatAutoBoxing();
		floatUnboxing();
		floatAutoUnboxing();
		charBoxing();
		charAutoBoxing();
		characterUnboxing();
		characterAutoUnboxing();
	}

	public static void intBoxing() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println("intBoxing: " + b);
	}

	public static void intAutoBoxing() {
		int a = 10;
		Integer b = a;
		System.out.println("intAutoBoxing: " + b);
	}

	public static void integerUnboxing() {
		Integer result = 20;
		int newResult = result.intValue();
		System.out.println("IntegerUnboxing: " + newResult);
	}

	public static void integerAutoUnboxing() {
		Integer result = 20;
		int newResult = result;
		System.out.println("IntegerAutoUnboxing: " + newResult);
	}

	public static void byteBoxing() {
		byte a = 100;
		Byte b = Byte.valueOf(a);
		System.out.println("byteBoxing: " + b);
	}

	public static void byteAutoBoxing() {
		byte a = 100;
		Byte b = a;
		System.out.println("byteAutoBoxing: " + b);
	}

	public static void byteUnboxing() {
		Byte a = 101;
		Byte b = a.byteValue();
		System.out.println("byteUnboxing: " + b);
	}

	public static void byteAutoUnboxing() {
		Byte a = 101;
		Byte b = a;
		System.out.println("byteAutoUnboxing: " + b);
	}

	public static void shortBoxing() {

	}

	public static void shortAutoBoxing() {

	}

	public void shortUnboxing() {

	}

	public void shortAutoUnboxing() {

	}

	public void longBoxing() {

	}

	public void longAutoBoxing() {

	}

	public void longUnboxing() {

	}

	public void longAutoUnboxing() {

	}

	public void doubleBoxing() {

	}

	public void doubleAutoBoxing() {

	}

	public void doubleUnboxing() {

	}

	public void doubleAutoUnboxing() {

	}

	public void booleanBoxing() {

	}

	public void booleanAutoBoxing() {

	}

	public void booleanUnboxing() {

	}

	public void booleanAutoUnboxing() {

	}

	public static void floatBoxing() {
		float a = 3.14f;
		Float b = Float.valueOf(a);
		System.out.println("floatBoxing: " + b);
	}

	public static void floatAutoBoxing() {
		float a = 3.14f;
		Float b = a;
		System.out.println("floatAutoBoxing" + b);
	}

	public static void floatUnboxing() {
		Float result = 3.14f;
		Float newResult = result.floatValue();
		System.out.println("FloatUnboxing" + newResult);
	}

	public static void floatAutoUnboxing() {
		Float result = 3.14f;
		Float newResult = result;
		System.out.println("floatAutoUnboxing: " + newResult);
	}

	public static void charBoxing() {
		char a = 'a';
		Character b = Character.valueOf(a);
		System.out.println("charBoxing: " + b);
	}

	public static void charAutoBoxing() {
		char a = 'a';
		Character b = a;
		System.out.println("charAutoBoxing: " + b);
	}

	public static void characterUnboxing() {
		Character result = 'a';
		char newResult = result.charValue();
		System.out.println("CharacterUnboxing: " + newResult);
	}

	public static void characterAutoUnboxing() {
		Character result = 'a';
		char newResult = result;
		System.out.println("characterAutoUnboxing: " + newResult);
	}
}

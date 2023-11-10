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
		shortBoxing();
		shortAutoBoxing();
		shortUnboxing();
		shortAutoUnboxing();
		longBoxing();
		longAutoBoxing();
		longUnboxing();
		longAutoUnboxing();
		doubleBoxing();
		doubleAutoBoxing();
		doubleUnboxing();
		doubleAutoUnboxing();
		booleanBoxing();
		booleanAutoBoxing();
		booleanUnboxing();
		booleanAutoUnboxing();
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
		byte b = a.byteValue();
		System.out.println("byteUnboxing: " + b);
	}

	public static void byteAutoUnboxing() {
		Byte a = 101;
		byte b = a;
		System.out.println("byteAutoUnboxing: " + b);
	}

	public static void shortBoxing() {
		short a = 10;
		Short b = Short.valueOf(a);
		System.out.println("shortBoxing: " + b);
	}

	public static void shortAutoBoxing() {
		short a = 10;
		Short b = a;
		System.out.println("shortAutoBoxing: " + b);
	}

	public static void shortUnboxing() {
		Short a = 10;
		short b = a.shortValue();
		System.out.println("shortUnboxing: " + b);
	}

	public static void shortAutoUnboxing() {
		Short a = 10;
		short b = a;
		System.out.println("shortAutoUnboxing: " + b);
	}

	public static void longBoxing() {
		long a = 123123;
		Long b = Long.valueOf(a);
		System.out.println("longBoxing: " + b);
	}

	public static void longAutoBoxing() {
		long a = 123123;
		Long b = a;
		System.out.println("longAutoBoxing: " + b);
	}

	public static void longUnboxing() {
		Long a = 123123L;
		long b = a.longValue();
		System.out.println("longUnboxing: " + b);
	}

	public static void longAutoUnboxing() {
		Long a = 123123L;
		long b = a;
		System.out.println("longAutoUnboxing: " + b);
	}

	public static void doubleBoxing() {
		double a = 1.23;
		Double b = Double.valueOf(a);
		System.out.println("doubleBoxing: " + b);
	}

	public static void doubleAutoBoxing() {
		double a = 1.32;
		Double b = a;
		System.out.println("doubleAutoBoxing: " + b);
	}

	public static void doubleUnboxing() {
		Double a = 1.2;
		double b = a.doubleValue();
		System.out.println("doubleUnboxing: " + b);
	}

	public static void doubleAutoUnboxing() {
		Double a = 1.23;
		double b = a;
		System.out.println("doubleAutoUnboxing: " + b);
	}

	public static void booleanBoxing() {
		boolean a = true;
		Boolean b = Boolean.valueOf(a);
		System.out.println("booleanBoxing: " + b);
	}

	public static void booleanAutoBoxing() {
		boolean a = false;
		Boolean b = a;
		System.out.println("booleanAutoBoxing: " + b);
	}

	public static void booleanUnboxing() {
		Boolean a = 1 > 2;
		boolean b = a.booleanValue();
		System.out.println("booleanUnboxing: " + b);
	}

	public static void booleanAutoUnboxing() {
		Boolean a = 1 < 2;
		boolean b = a;
		System.out.println("booleanAutoUnboxing: " + b);
	}

	public static void floatBoxing() {
		float a = 3.14f;
		Float b = Float.valueOf(a);
		System.out.println("floatBoxing: " + b);
	}

	public static void floatAutoBoxing() {
		float a = 3.14f;
		Float b = a;
		System.out.println("floatAutoBoxing: " + b);
	}

	public static void floatUnboxing() {
		Float result = 3.14f;
		float newResult = result.floatValue();
		System.out.println("FloatUnboxing: " + newResult);
	}

	public static void floatAutoUnboxing() {
		Float result = 3.14f;
		float newResult = result;
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
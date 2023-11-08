package com.java.day17.Oct_28_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program13_Throws_Keyword_in_Java {

	public static void main(String[] args) throws FileNotFoundException {
		findingFile();
		// you can also surround with try-catch block
	}

	// throws keyword gives an indicator to the caller method that the method you
	// are calling has an exception and it could not handle it, so it is your job to
	// handle that exception. You can use throws keyword or else surround that
	// method with try-catch block.

	public static void findingFile() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("Desktop/abc.txt");
	}
}

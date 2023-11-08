package com.java.day17.Oct_28_2023;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class_More_Concepts {

	public static SimpleDateFormat sdf;

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String emailDateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(emailDateTimeStamp);

		// Do you want a different date format?
		// M/dd/yyyy
		// M/dd/yyyy hh:mm:ss

		sdf = new SimpleDateFormat("M/dd/yyy hh:mm:ss");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("MM/dd/yyy hh:mm:ss");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("MMM/dd/yyy hh:mm:ss");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("MMMM/dd/yyy hh:mm:ss");
		System.out.println(sdf.format(date));

	}
}
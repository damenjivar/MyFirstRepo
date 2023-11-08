package com.java.day9.Sep_30_2023;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);
		String emailDateTimeStamp = date.toString().replace(" ", "_").toString().replace(":", "_");
		System.out.println(emailDateTimeStamp);
		return "seleniumpanda" + emailDateTimeStamp + "@gmail.com";

	}
}

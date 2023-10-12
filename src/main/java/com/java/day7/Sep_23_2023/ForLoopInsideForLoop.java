package com.java.day7.Sep_23_2023;

public class ForLoopInsideForLoop {

	// nested loops - if a loop exists inside the body of another loop then it is
	// called nested loop

	public static void main(String[] args) {
		// monthsAndDays();
		// method1();
		statesAndCities();
	}

	public static void monthsAndDays() {
		int months = 12;
		int days = 30;

		// outer loop will print each month
		// inner loop will print the days of the month

		for (int i = 1; i <= months; i++) {
			System.out.println("month is : " + i);

			for (int j = 1; j <= days; j++) {
				System.out.println("day is : " + j);
			}
			System.out.println();
		}

	}

	public static void method1() {
		// outer loop - i is from 1 to 10

		for (int i = 1; i <= 10; i++) {

			// inner for loop - j is from 1 to 5
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}

	}

	public static void statesAndCities() {
		int states = 50;
		int cities = 5;

		for (int i = 1; i <= states; i++) {
			System.out.println("state is : " + i);

			for (int j = 1; j <= cities; j++) {
				System.out.println("cities is : " + j);
			}
			System.out.println();
		}

	}
}

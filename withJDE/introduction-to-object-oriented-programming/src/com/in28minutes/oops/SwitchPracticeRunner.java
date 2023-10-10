package com.in28minutes.oops;

import java.util.Scanner;

public class SwitchPracticeRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("please input number");
		int selectedNumber = scanner.nextInt();

		String nameOfDay = SwitchPractice.determineNameOfDay(selectedNumber);
		String nameOfMonth = SwitchPractice.determineNameOfMonth(selectedNumber);
		boolean isWeekDay = SwitchPractice.isWeekDay(selectedNumber);

		System.out.println("the name of day is " + nameOfDay);
		System.out.println("the name of month is " + nameOfMonth);
		System.out.println("and weekday or not is " + isWeekDay);
	}

}

package com.in28minutes.whilePractice;

public class StringPracticeRunner {
	public static void main(String[] args) {
		String[] dayList = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		StringPractice days = new StringPractice(dayList);

		// print out longest day
		String longest = days.longestString();
		System.out.println(longest);

		// print days backwards
		days.printBackwards();

	}
}

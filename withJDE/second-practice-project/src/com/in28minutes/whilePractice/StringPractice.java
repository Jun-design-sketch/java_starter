package com.in28minutes.whilePractice;

public class StringPractice {

	// declaration of array
	String[] days;

	// constructor
	public StringPractice(String[] days) {
		this.days = days;
	}

	public String longestString() {
		int longest = 0;
		String longestString = "";

		for (String day : days) {
			if (day.length() > longest) {
				longest = day.length();
				longestString = day;
			}
		}

		return longestString;
	}

	public void printBackwards() {
		int quantity = days.length;
		for (int i = quantity - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}
	}

}

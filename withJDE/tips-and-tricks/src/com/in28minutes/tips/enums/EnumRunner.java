package com.in28minutes.tips.enums;

import java.util.Arrays;

public class EnumRunner {
	public static void main(String[] args) {
		// how to restrict a value?
		Season season = Season.Summer;

		Season season1 = Season.valueOf("Winter");
		System.out.println(season1.ordinal());
		System.out.println(Season.Spring.ordinal());
		System.out.println(Season.Spring.getValue());

		System.out.println(Arrays.toString(Season.values()));
	}
}

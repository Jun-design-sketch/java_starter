package com.in28minutes.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> lists = List.of("Apple", "Bat", "Cat", "Dog");

		printBasic(lists);
		printBasicWithFPFiltering(lists);
	}

	private static void printBasic(List<String> lists) {
		for (String list : lists) {
			System.out.println(list);
		}
	}

	private static void printBasicWithFPFiltering(List<String> lists) {
		lists.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}
}

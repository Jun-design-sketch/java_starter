package com.in28minutes.functionalProgramming;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// normalSum(numbers);

		// numbers.stream().forEach(element -> System.out.println(element));
		fpSum(numbers);
	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // mutation
		}

		System.out.println(sum);
	}

	private static void fpSum(List<Integer> numbers) {
		System.out.println(numbers.stream().reduce(0, (number1, number2) -> number1 + number2));
	}
}

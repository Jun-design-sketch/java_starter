package com.in28minutes.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> MethodReferencesRunner.print(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);

		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max);

		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

		List.of(23, 43, 34, 45, 36).stream().filter(evenPredicate).map(n -> n * n)
				.forEach(e -> System.out.println(e));
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
}

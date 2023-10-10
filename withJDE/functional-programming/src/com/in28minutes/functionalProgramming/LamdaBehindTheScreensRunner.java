package com.in28minutes.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}

}

public class LamdaBehindTheScreensRunner {

	public static void main(String[] args) {
		List.of(23, 34, 36, 43, 45, 46).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

		List.of(23, 34, 36, 43, 45, 46).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));
	}
}

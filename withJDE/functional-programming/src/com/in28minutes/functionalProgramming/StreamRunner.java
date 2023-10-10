package com.in28minutes.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamRunner {
	public static void main(String[] args) {
		// practice1 : print out square of 1 to 10
		System.out.println("practice1");
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		// practce2: map all to lower case
		System.out.println("practice2");
		List<String> strs = List.of("Apple", "Ant", "Bat");
//		strs.stream().map(String::toLowerCase).forEach(e -> System.out.println(e));
		strs.stream().map(s -> s.toLowerCase()).forEach(e -> System.out.println(e));

		// practice3: print the length of each element
		System.out.println("practice3");
		strs.stream().map(s -> s.length()).forEach(e -> System.out.println(e));
	}
}

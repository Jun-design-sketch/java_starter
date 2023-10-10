package com.in28minutes.oops;

public class BiNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instance of class
		BiNumber numbers = new BiNumber(2, 3);

		// use setter(already used constructor, but)
		numbers.setNumber1(6);
		numbers.setNumber2(11);

		// use methods
		// add
		System.out.println(numbers.add());
		// multiply
		System.out.println(numbers.multiply());
		// double both value
		numbers.doubles();
		// get num1
		System.out.println(numbers.getNumber1());
		// get num2
		System.out.println(numbers.getNumber2());

	}

}

package com.in28minutes.oops;

public class ForPracticeRunner {

	public static void main(String[] args) {
		// construct
		ForPractice number = new ForPractice(8);

		// Is a number Prime?
		boolean isPrime = number.isPrime();
		System.out.println(isPrime);

		// sum of numbers up to n
		int sum = number.sumUptoN();
		System.out.println(sum);

		// sum of divisors
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);

		number.printANumberTriangle();
	}

}

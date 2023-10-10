package com.in28minutes.oops;

public class ForPractice {
	private int number;

	ForPractice(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// Guard Condition
		if (number < 2) {
			return false;
		}

		// in fact, int num is unnecessary
		// I can use class variable "number"

		// get number smaller than original number
		int num = this.number - 1;

		// Loop: divide
		for (; num >= 2; num--) {
			if (this.number % num != 0) {
				// maybe prime
				continue;
			} else {
				// not prime
				return false;
			}
		}
		// absolutely prime
		return true;
	}

	// Sum of numbers up to n
	public int sumUptoN() {

		int num = this.number;
		int sum = 0;

		for (; num >= 1; num--) {
			sum += num;
		}

		return sum;
	}

	public int sumOfDivisors() {
		int num = this.number;
		int sum = 0;

		for (; num >= 1; num--) {
			if (this.number % num == 0) {
				sum += num;
			}
		}

		return sum;
	}

	public void printANumberTriangle() {
		int num = this.number;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

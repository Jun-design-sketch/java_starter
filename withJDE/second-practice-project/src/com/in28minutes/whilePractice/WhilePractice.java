package com.in28minutes.whilePractice;

import java.util.Scanner;

public class WhilePractice {
	private int number;

	WhilePractice(int number) {
		this.number = number;
	}

	// for limit = number, output would be square number
	public void printSquaresUptoLimit() {
		int i = number;
		while (i >= 1) {
			if (i * i <= number) {
				System.out.print(i * i + " ");
			}
			i--;
		}
		System.out.println();
	}

	// for limit = number, output would be cube number
	public void printCubesUptoLimit() {
		int i = number;
		while (i >= 1) {
			if (i * i * i <= number) {
				System.out.print(i * i * i + " ");
			}
			i--;
		}
		System.out.println(" ");
	}

	public void printCubesFromInput() {
		Scanner scanner = new Scanner(System.in);
		int originalNum;

		do {
			System.out.println("Enter a number:");
			originalNum = scanner.nextInt();

			if (originalNum >= 0) {
				System.out.println("Cube is " + originalNum * originalNum * originalNum);
			}

		} while (originalNum >= 0);

		System.out.println("Thank you! Have Fun!");
	}
}

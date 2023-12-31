package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// use finally for run code though there are exceptions
			System.out.println("Before Scanner Close");
			scanner.close();
		}

		System.out.println("Just before closing out main");
	}

}

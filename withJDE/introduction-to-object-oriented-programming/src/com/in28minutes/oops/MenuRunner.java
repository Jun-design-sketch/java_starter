package com.in28minutes.oops;

import java.util.Scanner;

/*
 * get userInput num1, num2
 * show menu
 * get selectedMenu
 * show result
 * */
public class MenuRunner {

	public static void main(String[] args) {
		// Type obj = new Type(argument);
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();

		// Number1
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is - " + number1);
		menu.setNumber1(number1);

		// Number2
		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is - " + number2);
		menu.setNumber2(number2);

		// Menu
		int number3;

		do {
			Menu.selectFunction();
			number3 = scanner.nextInt();
			System.out.println("Operation: " + number3);

			// Result
			int result = menu.calculate(number3);
			System.out.println("The answer is " + result);
		} while (number3 != 5);
		System.out.println("Bye!");

	}

}

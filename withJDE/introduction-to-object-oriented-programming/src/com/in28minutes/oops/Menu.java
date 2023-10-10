package com.in28minutes.oops;

public class Menu {
	private int number1;
	private int number2;

	// Constructor
	Menu() {
	}

	Menu(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	// Validate?

	// Setter
	// TODO how to get bigDecimal and integer both?
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	// function
	public int add(int number1, int number2) {
		int addResult = number1 + number2;
		return addResult;
	}

	public int subtract(int number1, int number2) {
		int subtractResult = number1 - number2;
		return subtractResult;
	}

	// TODO how to calculate bigDecimal?
	public int devide(int number1, int number2) {
		int devideResult = number1 / number2;
		return devideResult;
	}

	public int multiply(int number1, int number2) {
		int multiplyResult = number1 * number2;
		return multiplyResult;
	}

	// show select menu
	public static void selectFunction() {
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("5 - Exit");
		System.out.println("Enter selectMenu:");
	}

	// calculate, show result
	public int calculate(int number3) {
		int result = 0;

		if (number3 == 1) {
			result = add(number1, number2);
		} else if (number3 == 2) {
			result = subtract(number1, number2);
		} else if (number3 == 3) {
			result = devide(number1, number2);
		} else if (number3 == 4) {
			result = multiply(number1, number2);
		} else if (number3 == 5) {
			// no problem
		} else {
			System.out.println("Please select valid number. Try again.");
		}

		return result;
	}

}

package com.in28minutes.oops;

public class BiNumber {

	private int number1;
	private int number2;

	BiNumber(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}

	void setNumber1(int num1) {
		this.number1 = num1;
	}

	void setNumber2(int num2) {
		this.number2 = num2;
	}

	int getNumber1() {
		return this.number1;
	}

	int getNumber2() {
		return this.number2;
	}

	int add() {
		int addedValue = this.number1 + this.number2;
		return addedValue;
	}

	int multiply() {
		int multipliedValue = this.number1 * this.number2;
		return multipliedValue;
	}

	// the name "double" cannot be used
	void doubles() {
		this.number1 = this.number1 * 2;
		this.number2 = this.number2 * 2;
	}

}

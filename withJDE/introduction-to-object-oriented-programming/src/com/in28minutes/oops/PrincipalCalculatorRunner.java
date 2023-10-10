package com.in28minutes.oops;

import java.math.BigDecimal;

public class PrincipalCalculatorRunner {

	public static void main(String[] args) {

		// initialized with constructor
		PrincipalCalculator calculator = new PrincipalCalculator("4500.00", "7.5");
		// get total value of money (after 5 years)
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		// sysout
		System.out.println(totalValue);

	}

}

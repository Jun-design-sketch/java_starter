package com.in28minutes.oops;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// make instance
		Company apple = new Company();

		// use instance's method
		apple.start();

		// use instance's method 2
		String getAnswer = apple.conversation("Hello");
		System.out.printf(getAnswer).println();

		apple.endOfWork();
	}

}

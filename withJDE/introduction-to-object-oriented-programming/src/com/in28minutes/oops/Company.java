package com.in28minutes.oops;

public class Company {
	int money;
	int establishedYear;

	void start() {
		System.out.println("Start Working");
	}

	void selling() {
		System.out.println("Sell product");
	}

	String conversation(String question) {
		String answer = "answer of question";
		return answer;
	}

	void endOfWork() {
		System.out.println("end of work");
	}
}

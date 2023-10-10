package com.in28minutes.oops;

public class Book {

	int noOfCopies;

	Book(int initialCopies) {
		this.noOfCopies = initialCopies;
	}

	void setNoOfCopies(int num) {
		this.noOfCopies = num;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	void read() {
		System.out.println("start reading");
	}
}

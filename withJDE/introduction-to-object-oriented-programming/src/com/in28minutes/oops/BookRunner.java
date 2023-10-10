package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(30);

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

	}

}

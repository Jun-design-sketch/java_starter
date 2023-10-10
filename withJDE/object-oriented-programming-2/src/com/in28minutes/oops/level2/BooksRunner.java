package com.in28minutes.oops.level2;

public class BooksRunner {
	public static void main(String[] args) {
		Books book = new Books(1, "Object Oriented Programming with Java", "John Walter");

		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}
}

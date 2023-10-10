package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Books {
	// state
	private int id;
	private String name;
	private String author;
	public ArrayList<Review> reviews = new ArrayList<>();

	// constructor that make state
	public Books(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	// behavior
	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id - [%d] name - [%s] author - [%s] reviews - [%s]", id, name, author, reviews);
	}
}

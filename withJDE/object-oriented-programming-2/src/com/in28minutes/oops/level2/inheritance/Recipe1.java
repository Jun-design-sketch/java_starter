package com.in28minutes.oops.level2.inheritance;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("getReady");
	}

	@Override
	void doTheDish() {
		System.out.println("prepare dish");
	}

	@Override
	void cleanUp() {
		System.out.println("clean up");
	}
}

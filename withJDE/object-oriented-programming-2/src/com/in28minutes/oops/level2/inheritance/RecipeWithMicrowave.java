package com.in28minutes.oops.level2.inheritance;

public class RecipeWithMicrowave extends AbstractRecipe {
	@Override
	void getReady() {
		System.out.println("getReady");
		System.out.println("turn on microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("prepare dish");
		System.out.println("put it in microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("clean up");
		System.out.println("turn off microwave");
	}
}

package com.in28minutes.oops.level2.inheritance;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}

	void getReady() {
	};

	void doTheDish() {
	};

	void cleanUp() {
	};

	// prepare
	// recipe
	// cleanup

}

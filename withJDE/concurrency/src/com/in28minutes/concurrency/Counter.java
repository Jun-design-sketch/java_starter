package com.in28minutes.concurrency;

public class Counter {
	int i;

	// thread safety
	synchronized public void increment() {
		i++;
		// get i
		// increment
		// set i
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

}

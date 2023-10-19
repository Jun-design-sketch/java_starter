package com.in28minutes.concurrency;

public class BiCounter {
	private int i;
	private int j;

	// thread safety
	synchronized public void incrementI() {
		i++;
		// get i
		// increment
		// set i
	}

	synchronized public void incrementJ() {
		j++;
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

	/**
	 * @return the i
	 */
	public int getJ() {
		return j;
	}

}

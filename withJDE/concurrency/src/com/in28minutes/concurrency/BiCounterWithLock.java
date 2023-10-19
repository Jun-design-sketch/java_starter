package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i;
	private int j;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	// thread safety
	public void incrementI() {
		lockForI.lock();// Get Lock For I
		i++;
		lockForI.unlock();
		// Release Lock For I
	}

	public void incrementJ() {
		lockForJ.lock();// Get Lock For J
		j++;
		lockForJ.unlock();
		// Release Lock For J
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

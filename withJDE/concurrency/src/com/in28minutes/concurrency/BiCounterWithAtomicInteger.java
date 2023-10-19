package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	// thread safety
	public void incrementI() {
		i.incrementAndGet();
	}

	public void incrementJ() {
		j.incrementAndGet();
		// Release Lock For J
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i.get();
	}

	/**
	 * @return the i
	 */
	public int getJ() {
		return j.get();
	}

}

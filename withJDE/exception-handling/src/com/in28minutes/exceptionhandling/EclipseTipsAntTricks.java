package com.in28minutes.exceptionhandling;

import java.math.BigDecimal;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		return 0;
	}

}

public class EclipseTipsAntTricks {

	public static void main(String[] args) throws InterruptedException {
		DummyForTest dt = new DummyForTest();
		dt.doSomething();

		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(extracted());
	}

	private static int extracted() {
		return 1000 * 45 * 456;
	}
}

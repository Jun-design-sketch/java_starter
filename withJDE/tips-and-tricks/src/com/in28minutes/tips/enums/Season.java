package com.in28minutes.tips.enums;

public enum Season {
	Winter(1), Spring(2), Summer(3), Fall(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}
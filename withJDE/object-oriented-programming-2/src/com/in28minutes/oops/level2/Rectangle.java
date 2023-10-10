package com.in28minutes.oops.level2;

public class Rectangle {

	// state
	private double height;
	private double width;
	private double size;

	// constructor that decide state
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		this.size = height * width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return String.format("height - %f, width - %f, size - %f", height, width, size);
	}


}

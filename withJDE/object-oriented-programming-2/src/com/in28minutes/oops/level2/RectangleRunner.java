package com.in28minutes.oops.level2;

public class RectangleRunner {
	public static void main(String[] args) {

		Rectangle newRec = new Rectangle(1.5, 2.5);
		System.out.println(newRec);

		newRec.setHeight(5);
		System.out.println(newRec);

		newRec.setWidth(10);
		System.out.println(newRec);

	}
}

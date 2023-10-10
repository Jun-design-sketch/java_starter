package com.in28minutes.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 0.34567, "blue");

		fan.switchOn();
		fan.setSpeed((byte) 5);

		System.out.println(fan);

		fan.switchOff();

		System.out.println(fan);
	}
}

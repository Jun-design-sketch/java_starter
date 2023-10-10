package com.in28minutes.oops;

public class MotorBike {

	// state
	private int speed; // member variable

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
		System.out.println(this.speed);
	}

	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}

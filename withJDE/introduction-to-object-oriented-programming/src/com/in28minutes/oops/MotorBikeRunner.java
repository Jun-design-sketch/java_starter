package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();

		ducati.start();
		honda.start();

		// use getter and setter : Capsulation 1
		ducati.setSpeed(100);

		// get speed
//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed += 100;
//		ducati.setSpeed(ducatiSpeed);
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed += 100;
//		honda.setSpeed(hondaSpeed);

		// businessLogic : Capsulation 2
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		// increase it by 100
		// set it to ducati

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());
	}

}

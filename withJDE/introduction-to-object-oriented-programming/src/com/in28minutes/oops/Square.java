package com.in28minutes.oops;

public class Square {
	int firstAngle;
	int secondAngle;
	int thirdAngle;
	int fourthAngle;
	int menseki;
	int height;
	int width;

	// Constructor 生成子

	Square() {
		this.height = 1;
		this.width = 1;
	}

	void setFirstAngle(int angle) {
		this.firstAngle = angle;
	}

	int getFirstAngle() {
		return this.firstAngle;
	}

}

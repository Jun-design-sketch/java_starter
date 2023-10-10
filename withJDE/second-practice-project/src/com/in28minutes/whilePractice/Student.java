package com.in28minutes.whilePractice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String studentName;
	// int[] marks;
	private ArrayList<Integer> marks = new ArrayList();

	// variable arguments
	public Student(String name, ArrayList marks) {
		this.marks = marks;
		this.studentName = name;
	}

	public int getNumberOfMarks() {
		int numberOfMarks = this.marks.size();
		return numberOfMarks;
	}

	public int getTotalSumOfMarks() {
		int totalSumOfMarks = 0;

		for (int marks : marks) {
			totalSumOfMarks += marks;
		}
		return totalSumOfMarks;
	}

	public int getMaximumMark() {
//		int max = Arrays.stream(this.marks).max().getAsInt();
		int max = Collections.max(marks);
		return max;
	}

	public int getMinumumMark() {
//		int min = Arrays.stream(this.marks).min().getAsInt();
		int min = Collections.min(marks);
		return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = this.getTotalSumOfMarks();
		int number = this.getNumberOfMarks();
		BigDecimal bdnumber = new BigDecimal(number);
		// divide(divisor, precision, roundingMode)
		BigDecimal average = new BigDecimal(sum).divide(bdnumber, 3, RoundingMode.UP);

		return average;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

	@Override
	public String toString() {
		return studentName + marks;
	}

}

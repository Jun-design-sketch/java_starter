package com.in28minutes.whilePractice;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRunner {
	public static void main(String[] args) {

		String studentName = "John";
		ArrayList<Integer> studentMarks = new ArrayList<Integer>();

		studentMarks.add(55);
		studentMarks.add(69);
		studentMarks.add(99);
		studentMarks.add(100);
		studentMarks.add(100);
		studentMarks.add(100);

		Student student = new Student(studentName, studentMarks);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinumumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println("number of marks is: " + number);
		System.out.println("sum is: " + sum);
		System.out.println("maximum mark is: " + maximumMark);
		System.out.println("minimum mark is: " + minimumMark);
		System.out.println("average is: " + average);

		String summary = student.toString();
		System.out.println(summary);

		// ArrayList add
		student.addNewMark(35);
		System.out.println(student);

		// ArrayList remove
		student.removeMarkAtIndex(1);
		System.out.println(student);

	}
}

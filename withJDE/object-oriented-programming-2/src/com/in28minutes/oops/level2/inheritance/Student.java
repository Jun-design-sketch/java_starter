package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
	private String collegename;
	private int year;
	// extend = IS A...

	public Student(String name, String collegeName) {
		super(name);
		this.collegename = collegeName;
	}

	/**
	 * @return the collegename
	 */
	public String getCollegename() {
		return collegename;
	}

	/**
	 * @param collegename the collegename to set
	 */
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

}

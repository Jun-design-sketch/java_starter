package com.in28minutes.oops.level2.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private int employeeGrade;
	private int salary;

//	public Employee(String title, String employer, int employeeGrade, int salary) {
//		this.title = title;
//		this.employer = employer;
//		this.employeeGrade = employeeGrade;
//		this.salary = salary;
//	}

	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

//	public String toString2() {
	@Override
	public String toString() {
		return super.toString() + title + "#" + employer + "#" + employeeGrade + "#" + salary;
		// name + "#" + email + "#" + phoneNumber
	};

}

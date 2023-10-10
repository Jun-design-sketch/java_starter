package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {
	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("name1");
		// student.setEmail("in28minutes@gmail.com");

		Employee employee = new Employee("Ranga", "Programmer Analyst");
		String value = employee.toString();

		System.out.println(value);


	}
}

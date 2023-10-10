package com.in28minutes.oops.level2.inheritance;

public class EmployeeRunner {
	public static void main(String[] args) {

		Employee tom = new Employee("testName", "testEmployer");
//		tom.setName("Tom Riddle");
//		tom.setEmail("tom@riddle.com");
//		tom.setPhoneNumber("000-0000-0000");

//		String personInfo = tom.toString();
//		System.out.println(personInfo);
//		String employeeInfo = tom.toString2();
//		System.out.println(employeeInfo);

		String employeeInfo = tom.toString();
		System.out.println(employeeInfo);
	}
}

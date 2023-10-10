package com.in28minutes.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {

		Address homeAddress = new Address("999-9 Star Building", "StarCity", "999999");
		Customer customer = new Customer("John Walter", homeAddress);

		Address workAddress = new Address("888-8 Moon Building", "MoonCity", "888888");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}

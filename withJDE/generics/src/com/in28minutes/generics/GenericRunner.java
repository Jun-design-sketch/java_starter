package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

	static <X> X doSomething(X value) {
		return null;
	}

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static Double sumOfNumberList(List<? extends Number> numbers) {
		Double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.1);
		numbers.add(1l);
		numbers.add(1.0f);
	}

	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println("empty list: " + emptyList);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4, 5.5)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

//		MyCustomList<String> list = new MyCustomList();
//		list.addElement("Element 1");
//		list.addElement("Element 2");
//		String value = list.get(0);
//		System.out.println(value);
//
//		System.out.println(list);

		MyCustomList<Integer> list2 = new MyCustomList();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(number);

		System.out.println(list2);
	}
}

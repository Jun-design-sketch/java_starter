package com.in28minutes.oops;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// make class instance
		Person yamada = new Person();

		// definition of variable of class
		yamada.height = 160;
		yamada.weight = 60;
		yamada.moneyStock = 2000;

		// use methods
		int yamadaMoney = yamada.answerOfMoneyStock();
		System.out.printf("yamada's money stock : %d", yamadaMoney).println();

		int yamadaDoCalculate = yamada.calculateAbility(3);
		System.out.printf("here is answer = %d", yamadaDoCalculate).println();

		yamada.goToWork();
	}

}

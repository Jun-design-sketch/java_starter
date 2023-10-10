package com.in28minutes.oops;

public class UseCharacterRunner {

	public static void main(String[] args) {
		char singleLetter = 'c';
		// constructor
		UseCharacter chTest = new UseCharacter(singleLetter);

		// boolean answer: vowel or not
		System.out.println(chTest.isVowel());

		// boolean answer: consonant or not
		System.out.println(chTest.isConsonant());

		// boolean answer: alphabet or not
		System.out.println(chTest.isAlphabet());

		chTest.printLowerCaseAlphabets();
		chTest.printUpperCaseAlphabets();

	}

}

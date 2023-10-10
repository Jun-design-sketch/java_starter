package com.in28minutes.oops;

public class UseCharacter {
	private char singleLetter;

	public UseCharacter(char singleLetter) {
		this.singleLetter = singleLetter;
	}

	public boolean isAlphabet() {
		boolean isAlphabet = ((this.singleLetter >= 'a') && (this.singleLetter <= 'z'))
				|| ((this.singleLetter >= 'A') && (this.singleLetter <= 'Z'));

		return isAlphabet;
	}

	public boolean isVowel() {
		boolean isVowel = (this.singleLetter == 'a') || (this.singleLetter == 'A') || (this.singleLetter == 'e')
				|| (this.singleLetter == 'E') || (this.singleLetter == 'i') || (this.singleLetter == 'I')
				|| (this.singleLetter == 'o') || (this.singleLetter == 'O') || (this.singleLetter == 'u')
				|| (this.singleLetter == 'U');
		;
		return isVowel;
	}

	public boolean isConsonant() {
		boolean isConsonant = !this.isVowel() && this.isAlphabet();
		return isConsonant;
	}



	public void printLowerCaseAlphabets() {
		for (char myChar = 'a'; myChar <= 'z'; myChar++) {
			System.out.println(myChar);
		}
	}

	public void printUpperCaseAlphabets() {
		for (char myChar = 'A'; myChar <= 'Z'; myChar++) {
			System.out.println(myChar);
		}

	}

}

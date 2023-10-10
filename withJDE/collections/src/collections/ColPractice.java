package collections;

import java.util.HashMap;
import java.util.Map;

public class ColPractice {
	public static void main(String[] args) {
		// each character = how many times?
		// each words = how many times?

		// split string between space
		String str = "This is an awesome occastion." + " This has never happend before.";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			Integer integer = occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}

		System.out.println(occurances);

		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			Integer integer = stringOccurances.get(word);
			if (integer == null) {
				stringOccurances.put(word, 1);
			} else {
				stringOccurances.put(word, integer + 1);
			}
		}

		System.out.println(stringOccurances);

	}
}

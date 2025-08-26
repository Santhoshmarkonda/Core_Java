package com.strings;

public class CapitalizeWords {
	public static void main(String[] args) {
		String sentence = "how are you";

		// Split sentence into words
		String[] words = sentence.split(" ");

		System.out.println("Capitalized words:");

		for (String word : words) {
			if (word.length() > 0) {
				// Capitalize first letter and add the rest
				char firstChar = Character.toUpperCase(word.charAt(0));
				String rest = word.substring(1); // You can use .toLowerCase() here if needed
				System.out.print(firstChar + rest + " ");
			}
		}
	}
}

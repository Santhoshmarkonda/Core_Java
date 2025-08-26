package com.strings;

public class SubstringsExample {
	public static void main(String[] args) {
		String str = "abcde";

		System.out.println("All substrings of \"" + str + "\":");

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}

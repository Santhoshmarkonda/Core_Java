package com.strings;

public class StringReverse {

	public static String reverse(String str) {

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		return reversed;
	}

	public static void main(String[] args) {
		String str = "Santhosh";
		System.out.println(reverse(str));
	}

}

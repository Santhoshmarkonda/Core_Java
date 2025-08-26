package com.strings;

public class StringPalindrome {
	
	public static boolean palindrome(String str) {
		
		String reverse = "";
		
		for(int a = str.length()-1;a>=0;a--) {
			reverse = reverse+str.charAt(a);
		}
		
		return str.equals(reverse);
	}
	
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(palindrome(str));
	}

}

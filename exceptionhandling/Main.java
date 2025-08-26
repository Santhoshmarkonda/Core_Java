package com.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		String str = "Santhosh";

		try {
			System.out.println(str.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
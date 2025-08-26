
package com.exceptionhandling;

public class ExceptionIntro {

	public static void main(String[] args) {
		String str = "Santhosh" ; //null should be written

		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
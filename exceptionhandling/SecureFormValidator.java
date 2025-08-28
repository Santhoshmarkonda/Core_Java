package com.exceptionhandling;

@SuppressWarnings("serial")
class InvalidUsernameException extends Exception {
	public InvalidUsernameException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class SecureFormValidator {

	public static void main(String[] args) {
		test("Santhosh", "22");     // ✅ Valid
		test("", "25");             // ❌ InvalidUsernameException
		test("Arjun", "sixteen");   // ❌ InvalidAgeException (caused by NumberFormatException)
		test("Kiran", "15");        // ❌ InvalidAgeException (age < 18)
	}

	public static void test(String username, String ageStr) {
		System.out.println("Testing with input: " + username + ", " + ageStr);
		try {
			validateUser(username, ageStr);
			System.out.println("Registration successful.\n");
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e);
			System.out.println("Root Cause: " + e.getCause() + "\n");
		}
	}

	public static void validateUser(String username, String ageStr)
			throws InvalidUsernameException, InvalidAgeException {

		if (username == null || username.trim().isEmpty()) {
			InvalidUsernameException e = new InvalidUsernameException("Username cannot be null or empty");
			e.initCause(new IllegalArgumentException("Input username is blank")); // Chaining with initCause()
			throw e;
		}

		int age = 0;
		try {
			age = Integer.parseInt(ageStr);
		} catch (NumberFormatException nfe) {
			throw new InvalidAgeException("Age must be a valid number", nfe);     // Constructor-based chaining
		}

		if (age < 18) {
			throw new InvalidAgeException("User must be 18 or older", new Exception("Age is below allowed limit")); // another
																													// constructor-based
																													// chaining
		}
	}
}

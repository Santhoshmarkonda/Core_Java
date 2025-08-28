package com.exceptionhandling;

// Custom Exceptions
@SuppressWarnings("serial")
class InvalidAccountException extends Exception {
	public InvalidAccountException(String message, Throwable cause) {
		super(message, cause);
	}
}

@SuppressWarnings("serial")
class InvalidTransactionAmountException extends Exception {
	public InvalidTransactionAmountException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class BankTransactionProcessor {

	public static void main(String[] args) {
		test("1234567890", "5000");       // ✅ Valid
		test("1234567abc", "500");        // ❌ InvalidAccountException
		test("1234567890", "-100");       // ❌ InvalidTransactionAmountException
		test("123456789", "200");         // ❌ InvalidAccountException (length issue)
	}

	static void test(String account, String amount) {
		System.out.printf("Testing transaction: Account='%s', Amount='%s'%n", account, amount);
		try {
			processTransaction(account, amount);
			System.out.println("Transaction processed successfully.\n");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			System.out.println("Root Cause: " + e.getCause() + "\n");
		}
	}

	public static void processTransaction(String accountNumber, String amountStr)
			throws InvalidAccountException, InvalidTransactionAmountException {

		// Validate account number: must be 10 digits
		if (accountNumber == null || !accountNumber.matches("\\d{10}")) {
			throw new InvalidAccountException(
					"Account number must be exactly 10 digits",
					new IllegalArgumentException("Invalid account format")
			);
		}

		// Validate transaction amount
		double amount;
		try {
			amount = Double.parseDouble(amountStr);
		} catch (NumberFormatException e) {
			throw new InvalidTransactionAmountException(
					"Transaction amount must be a valid number",
					e
			);
		}

		if (amount <= 0) {
			throw new InvalidTransactionAmountException(
					"Transaction amount must be positive",
					new Exception("Amount <= 0")
			);
		}

		// If all validations pass
		System.out.println("Valid Account and Amount");
	}
}

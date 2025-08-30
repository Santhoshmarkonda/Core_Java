package com.exceptionhandling;

@SuppressWarnings("serial")
class DatabaseConnectionException extends Exception {
	public DatabaseConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class Task_1 {

	public static void connectDatabase(String str) throws DatabaseConnectionException {
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
		} catch (NumberFormatException e) {
			throw new DatabaseConnectionException("Invalid Number", e);
		}

	}

	public static void main(String[] args) throws DatabaseConnectionException {
		String str = "santhosh";
		try {
			connectDatabase(str);
		} catch (DatabaseConnectionException de) {
			System.out.println("Exception: " + de.getMessage());
			System.out.println("Root Cause: " + de.getCause());
		} finally {
			System.out.println("code successfully executed.");
		}
	}

}

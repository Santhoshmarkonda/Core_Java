package com.exceptionhandling;

@SuppressWarnings("serial")
class PaymentFailedException extends Exception{
	public PaymentFailedException(String message) {
		super(message);
	}
}

public class Task_2 {
	
	public static void transaction(int amount) throws ArithmeticException {
			double d = amount/0;
			System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		try {
			transaction(10000);
		}
	catch(ArithmeticException e) {
		PaymentFailedException p = new PaymentFailedException("Payment Failed");
		p.initCause(e);
		System.out.println("Exception: "+ p.getMessage());
		System.out.println("Root Cause: "+ p.getCause());
	}
	}

}

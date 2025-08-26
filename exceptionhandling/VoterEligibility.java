package com.exceptionhandling;

@SuppressWarnings("serial")
class InvalidAgeExceptions extends Exception{
	public InvalidAgeExceptions(String message) {
		super(message);
	}
}

public class VoterEligibility {
	
	public static void checkVoterEligibility(int age) throws InvalidAgeExceptions{
		if(age<18) {
			throw new InvalidAgeExceptions("Not eligible to vote");
		}else
			System.out.println("Eligible to vote");
	}
	
    public static void main(String[] args) {
    	int age = 16;
		try {
			checkVoterEligibility(age);
		}catch(InvalidAgeExceptions e) {
			System.out.println(e.getMessage());
		}
	}
}

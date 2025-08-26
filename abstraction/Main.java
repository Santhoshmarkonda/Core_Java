package com.abstraction;

abstract class Atm {

	abstract public double showBalance(double amount);

	abstract public double withdrawAmount(double amount);

	abstract public void changePin(int pin);

	abstract public String accountantName(String name);

}

class A extends Atm {

	@Override
	public double showBalance(double amount) {
		return amount;
	}

	@Override
	public double withdrawAmount(double amount) {
		return amount;
	}

	@Override
	public void changePin(int pin) {
		System.out.println("Pin Updated");
	}

	@Override
	public String accountantName(String name) {
		return name;
	}

}

class Helper extends A {

	public static Atm getObject() {
		return new A();
	}
}

public class Main {

	public static void main(String[] args) {

		Atm atm = Helper.getObject();
		System.out.println("Accountant Name : " + atm.accountantName("Santhosh Markonda"));
		System.out.println("Account Balance : " + atm.showBalance(35000.56));
		System.out.println("Amount Debited  : " + atm.withdrawAmount(1000));
		atm.changePin(2345);
	}

}

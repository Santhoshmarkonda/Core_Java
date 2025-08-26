package com.functionalinterfaces;

import java.util.function.Consumer;

//2.consumer -> it does not give any output, only modifies the data.

class A {

	private String name = "someone";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ConsumerClass {
	public static void main(String[] args) {
		A a = new A();
		Consumer<A> setName = str -> str.setName("Santhosh");
		setName.accept(a);
		System.out.println(a.getName());
	}
}

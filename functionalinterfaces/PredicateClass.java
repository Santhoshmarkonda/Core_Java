package com.functionalinterfaces;

import java.util.function.Predicate;

//functional interfaces are 4 types
//1.predicate -> takes input and returns a boolean value

public class PredicateClass {

	public static void main(String[] args) {
		Predicate<Integer> isEven = i -> i % 2 == 0;
		boolean result = isEven.test(21);
		System.out.println(result);
	}

}

package com.lamdaexpressions;

@FunctionalInterface
interface Apple {
	void run(int a, int b);
}

public class Box {

	public static void main(String[] args) {

		Apple a = (i, j) -> System.out.println("addition is " + (i + j));

		a.run(5, 6);
	}

}

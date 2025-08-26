package com.lamdaexpressions;

@FunctionalInterface
interface Abc {
	int run(int a, int b);
}

public class Demo {

	public static void main(String[] args) {

		Abc a = (i, j) -> i + j;
		int result = a.run(3, 6);
		System.out.println(result);
	}

}

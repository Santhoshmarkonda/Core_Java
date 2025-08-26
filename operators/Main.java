package com.operators;

public class Main {
	
	public static void main(String[] args) {
		int a = 35;
		int b = 46;
		
		System.out.println("positive: "+a);
		System.out.println("negative"+(-b));
		System.out.println();
		System.out.println("post increment of a"+ a++);
		System.out.println("post increment of b"+ b++);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		System.out.println("pre increment"+(++a));
		System.out.println("post increment"+(++b));
		System.out.println();
		System.out.println("Arthematic operators in java");
		
		System.out.println("Addition:"+ (a+b));
		System.out.println("Subtraction:"+ (a-b));
		System.out.println("Multiplication:"+ (a*b));
		System.out.println("Division:"+ (a/b));
		System.out.println("Remainder:"+ (a%b));
		
		System.out.println();
		
		String result = (a==b)? "both are equal":"not equal";
		System.out.println("Result: "+result);
		
		System.out.println("Bitwise AND: "+(a&b));
		System.out.println("Bitwise OR: "+(a|b));
		System.out.println("Bitwise XOR: "+(a^b));
		
		System.out.println();
		
		System.out.println(a>b && b<a);
		
	}

}

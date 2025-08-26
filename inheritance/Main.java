package com.inheritance;

//parent class
class A {
//	public A(){
//        System.out.println("class A constructor invoked");
//	}
	public String toString() {
		return "class A object is created";
	}
}

//child class
class B extends A {
//	public B() {
//		System.out.println("class B constructor is invoked");
//	}
	public String toString() {
		return "class B object is created";
	}
}

//main class
public class Main {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println();
		B b = new B();
		System.out.println(b);
		System.out.println();
		A a1 = new B();
		System.out.println(a1);
		System.out.println();
//		B b1 = (B)new A(); Not CE but RE (java.lang.ClassCastException)
//		System.out.println();
		B b2 = (B) a1;
// it is possible when parent class reference assigned to child class object
		System.out.println(b2);
	}
}

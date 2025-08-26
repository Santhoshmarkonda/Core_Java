package com.multithreading;

class A extends Thread{
	public void run() {
		System.out.println("Thread A is running");
	}
}

class B extends Thread{
	public void run() {
		System.out.println("Thread B is running");
	}
}

public class Main {
	public static void main(String[] args) {
         A a = new A();
         B b = new B();
         
         a.start();
         try {
 			Thread.sleep(10);
 		} catch (InterruptedException e) {
 			e.getMessage();
 		}
         b.start();
         
	}
}

package com.multithreading;

class X implements Runnable {

	public void run() {
		System.out.println("Thread X is running");
	}
}

class Y implements Runnable{
	public void run() {
		System.out.println("Thread Y is running");
	}
}

public class ThreadInterface {

	public static void main(String[] args) {

		Runnable r1 = new X();
		Runnable r2 = new Y();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}

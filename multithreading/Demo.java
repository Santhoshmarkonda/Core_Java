package com.multithreading;

class As extends Thread{
	public void run() {
		System.out.println("RUNNING");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
		As a = new As();
		System.out.println(a.getState());
		a.start();
		System.out.println(a.getState());
		Thread.sleep(1000);
		System.out.println(a.getState());
	    a.join();
	    System.out.println(a.getState());
	}
}

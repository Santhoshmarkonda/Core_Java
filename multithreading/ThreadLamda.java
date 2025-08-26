package com.multithreading;

public class ThreadLamda {
	public static void main(String[] args) {
		Runnable a = () -> {
			System.out.println("Thread is running");		
		};
		Thread t1 = new Thread(a);
		t1.start();
	}
}

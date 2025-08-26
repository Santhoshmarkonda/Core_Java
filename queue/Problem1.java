package com.queue;

import java.util.LinkedList;
import java.util.Queue;

class MyQueue {

	Queue<Integer> q = new LinkedList<>();

	public void enqueue(int val) {
		q.add(val);
	}

	public void dequeue() {
		q.poll();
	}

	public int peek() {
		return q.peek();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}
	
	@Override
	public String toString() {
		return "MyQueue q= " + q ;
	}
}

public class Problem1 {
	public static void main(String[] args) {
        MyQueue mQ = new MyQueue();
        mQ.enqueue(10);
        mQ.enqueue(20);
        mQ.enqueue(30);
        mQ.enqueue(40);
        mQ.dequeue();
        System.out.println(mQ.peek());
        System.out.println("is Queue empty? "+ mQ.isEmpty());
        System.out.println(mQ);
	}

}

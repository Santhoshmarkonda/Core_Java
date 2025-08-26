package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Problem2 {
	
	public static void displayQueue(Queue<Integer> queue) {
	    int size = queue.size();
	    for (int i = 0; i < size; i++) {
	        int val = queue.poll();     
	        System.out.print(val + " ");
	        queue.offer(val);          
	    }
	}
	
	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		displayQueue(q);
	}

}

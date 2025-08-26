
package com.queue;

import java.util.LinkedList;

public class Problem3 {
	
	public static void main(String[] args) {
		LinkedList <Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
	}

}

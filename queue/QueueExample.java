package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Original Queue: " + queue);

        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Step 2: Push back into the queue (reversed order)
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}

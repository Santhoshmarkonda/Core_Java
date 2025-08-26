package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem4 {

    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.offer("Santhosh");
        names.offer("Ganga");
        names.offer("Kusuma");
        names.offer("Saraswathi");

        Stack<String> s = new Stack<>();

        while (!names.isEmpty()) {
            s.push(names.poll());  
        }

        while (!s.isEmpty()) {
            names.offer(s.pop());
        }

        System.out.println("Reversed Queue: " + names);
    }
}

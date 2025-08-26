package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        ListIterator<Integer> slow = list.listIterator();
        ListIterator<Integer> fast = list.listIterator();

        // Move fast two steps and slow one step
        while (fast.hasNext()) {
            fast.next(); // first step
            if (fast.hasNext()) {
                fast.next(); // second step
                slow.next(); // move slow one step
            }
        }

        System.out.println("Middle element: " + slow.next());
    }
}

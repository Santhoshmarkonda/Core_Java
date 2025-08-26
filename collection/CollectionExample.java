package com.collection;

import java.util.*;

public class CollectionExample {
	
	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Citrus","Dragon Fruit","Orange"));
		fruits.remove(4);
		System.out.println(fruits.contains("Lemon"));
		System.out.println(fruits.size());
		System.out.println(fruits.get(0));
		fruits.add(0, "Mango");
		System.out.println(fruits.isEmpty());
		System.out.println(fruits);
		fruits.sort((a,b)-> b.length() - a.length()); // Comparator
		System.out.println(fruits);
	}

}

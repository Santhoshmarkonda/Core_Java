package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIntro {

	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		// Collection methods
		System.out.println("Adding object: " + list.add(10));
		System.out.println("Removing Object: " + list.remove(3));
		System.out.println("is Object Present: " + list.contains(6));
		System.out.println("is List Empty: " + list.isEmpty());
		System.out.println("Size of the List: " + list.size());
		System.out.println("List Array: " + Arrays.toString(list.toArray()));
		System.out.println("List: " + list);
		list.clear();
		System.out.println("After clearing");
		System.out.println("List: " + list);

		Collection<Integer> list2 = new ArrayList<>(Arrays.asList(11, 12, 13));

		list.addAll(list2);

		System.out.println("After adding another list");
		System.out.println("Updated List: " + list);
		System.out.println("list Contains list2 Objects: " + list.containsAll(list2));
		
		System.out.println("Iterating using Iterator");
		Iterator <Integer> e = list.iterator();
		
		while(e.hasNext()) {
			Integer num = e.next();
			System.out.println("Object: "+num);
		}
	}
}

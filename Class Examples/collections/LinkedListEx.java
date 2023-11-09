package com.collections;

import java.util.LinkedList;

//1.Growable in nature
//2. utility methods
//3.heterogenous data
//List:-
//4.Duplicates are allowed
//5.Inserting order is stored

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(1234);

		ll.add("java");

		ll.add(true);

		ll.add('d');

		ll.add(3.14f);

		System.out.println(ll);

		ll.add(120);
		
		ll.add("java");

		System.out.println(ll);
		
		
	}

}

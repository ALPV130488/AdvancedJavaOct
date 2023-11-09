package com.collections;
//1.Growable in nature
//2. utility methods
//3.heterogenous data
//Set:-
//4.No duplicates
//5.Inserting order is not stored
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(1234);

		lhs.add("java");

		lhs.add(true);

		lhs.add('d');

		lhs.add(3.14f);

		System.out.println(lhs);

		lhs.add(120);
		
		lhs.add("java");

		System.out.println(lhs);
		
	}

}

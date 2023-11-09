package com.collections;


//1.Growable in nature
//2. utility methods
//3.heterogenous data
//Set:-
//4.No duplicates
//5.Inserting order is not stored
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(1234);

		hs.add("java");

		hs.add(true);

		hs.add('d');

		hs.add(3.14f);

		System.out.println(hs);

		hs.add(120);
		
		hs.add("java");

		System.out.println(hs);
		
		
	}
}

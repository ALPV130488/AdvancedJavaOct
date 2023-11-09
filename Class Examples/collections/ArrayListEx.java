package com.collections;

//1.Growable in nature
//2. utility methods
//3.heterogenous data
//List:-
//4.Duplicates are allowed
//5.Inserting order is stored

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(1234);

		al.add("java");

		al.add(true);

		al.add('d');

		al.add(3.14f);

		System.out.println(al);

		al.add(120);
		
		al.add("java");

		System.out.println(al);
		
		System.out.println(al.get(5));

	}

}

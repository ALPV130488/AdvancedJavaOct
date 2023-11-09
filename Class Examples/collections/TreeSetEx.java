package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>(new MyOrder());

		ts.add("apple");

		ts.add("zoo");					//obj1-obj2  a-z=-ve*-ve=-+ve

		ts.add("den");

		ts.add("bat");

		ts.add("cat");

		ts.add("apple");

		System.out.println(ts);

		Iterator<String> itr = ts.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}

class MyOrder implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
	
}

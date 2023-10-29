package com.demo;

public class Static {

	static int staticcounter;

	int instancecounter;

	void counter() {
		staticcounter++;

		instancecounter++;
		
		

	}
	
	void displayCounter() {
		System.out.println("static counter:-"+staticcounter);
		System.out.println("instance counter:-"+instancecounter);
		
		
	}

	public static void main(String[] args) {
		
		Static counter1 = new Static();
		
		Static counter2 = new Static();
		
		Static counter3 = new Static();
		
		counter1.counter();
		
		counter2.counter();
		
		counter3.counter();
		
		counter3.displayCounter();
		
		
	
		
		
		
		

	}

}

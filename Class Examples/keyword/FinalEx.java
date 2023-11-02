package com.keyword;

class Parent {
	final int value = 23;

	
	final public void displayHi() {
		System.out.println("Hello Everyone!!!!");
	}

}

public class FinalEx extends Parent {

	public static void main(String[] args) {

		FinalEx obj = new FinalEx();

		obj.displayHi();
		
//		obj.value=24;

		System.out.println(obj.value);
		
	}

//	@Override
//	public void displayHi() {
//		System.out.println("Good Morning everyone!!!!");
//	}

}

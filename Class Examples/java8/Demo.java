package com.java8;

public interface Demo {

	default  void display() {
	
		System.out.println("Hi everyone");
	}
	
	public static void  displayMsg() {
		System.out.println("Hello Everyone");
	}
}

package com.demo;

public class Constructor {
	
	public Constructor() {
		
		System.out.println("Iam from default construcor");
		
	}
	
	public Constructor(int a,int b) {
		System.out.println("Iam from parametrized constructor");
		
		System.out.println("sum of two integers is :-"+(a+b));
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor(2,3);
		
		
		
	}
}

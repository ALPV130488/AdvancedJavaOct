package com.demo;

public class StaticMethod {
	
	static int value =23;//static global var
	
	int apple=23;

	public static int add(int a, int b) {

		return (a + b);

	}

	public static void mul(int a, int b) {

		System.out.println(a * b);

	}

	public static void main(String[] args) {
		
		System.out.println(value);
		
		System.out.println(StaticMethod.add(2, 3));
		
		StaticMethod.mul(1, 10);

	}

}

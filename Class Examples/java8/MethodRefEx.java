package com.java8;

public class MethodRefEx {

	public static void main(String[] args) {
//		Calculator1 obj1 = new Calculator1();//object 1 using normal class
//		obj1.add(1, 3);
//		
//		Calculator obj2 = (a,b)->System.out.println(a+b);//object 2 using le
//		
//		obj2.add(50,10);

//		Calculator obj3 = Calculator1::add;// method reference for a static method
//
//		obj3.add(30, 20);

		Calculator obj4 =new Calculator1()::add;// method reference for an instance method

		obj4.add(30, 20);
	}

}

class Calculator1 // implements Calculator
{

	public  void add(int a, int b) {
		System.out.println("The sum of given two numbers is:-" + (a + b));

	}

}

@FunctionalInterface
interface Calculator {
	public void add(int a, int b);
}
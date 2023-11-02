package com.keyword;

class Parent3 {

	static int value = 23;

	public Parent3() {
		System.out.println("Iam from parent class default constructor");
	}

	public Parent3(String name) {
		System.out.println("Iam from Parent class parametrized Constructor");

		System.out.println("my name is:-" + name);

	}

	public void dispalyHi() {
		System.out.println("Hi everyone I'm from parent class met");
	}
}

public class SuperEx extends Parent3 {

	static int value = 45;

	public void dispalyHi() {
		System.out.println("Hi everyone I'm from child class met");
	}
	
	
	public  SuperEx() {
		
	super("apple");//calling parent class  constr
	
	super.dispalyHi();//calling parent classe met
	
	System.out.println(super.value);
	
	System.out.println(this.value);
	
	this.dispalyHi();
	
		
	}
	
	public SuperEx(String name) {
		
		this();//calls the current class default constructor
		
		System.out.println("Iam from child class parametrized constructor");
	
		System.out.println("My name is :-"+name);
	
	}

	public static void main(String[] args) {

		SuperEx obj = new SuperEx("orange");
		
		
		
		
	}

}

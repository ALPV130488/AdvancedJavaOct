package com.demo;

public class MethodExample {
	
	public String displayMsg() {//instance public met
		
		return  "What the hell is the matter with this java Session!!!!";
	}
	
	public void displayHi() {//instance public met 
		
		System.out.println("Hi Everyone!!!");
	}
	
	public int add(int a,int b) {//instance met with params..
		
		return (a+b);
	}
	
	
	

	public static void main(String[] args) {
		
		MethodExample obj = new MethodExample();
		
		
		System.out.println(obj.displayMsg());
		
		
		obj.displayHi();
		
		
		System.out.println(obj.add(2, 3));
		
		
		
	}

}

package com.exceptions;

public class Throws {
	
	public void division(int a,int b) throws ArithmeticException,NullPointerException
	{
		int  result = a/b;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Throws obj = new Throws();
		try {
		
		obj.division(4, 0);
		}catch(ArithmeticException e) {
			System.out.println("method is suggesting the type of exception");
		}
		
		
	}

}

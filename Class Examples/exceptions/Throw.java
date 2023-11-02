package com.exceptions;

public class Throw {

	static void valid(int value) {
	  
	  if(value>5) {
		  
		  throw new ArithmeticException("The value is equals to 0");
		  
	  }else{
		  
		  System.out.println("The value is not 0");
		
	  }
	  
  }
	
	public static void main(String[] args) {
		
		valid(6);
		
	}

}

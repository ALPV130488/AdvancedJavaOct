package com.exceptions;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numerator :-");
		int numerator=scan.nextInt();
		
		System.out.print("Enter the denominator:-");
		int denominator=scan.nextInt();
		
		try{
		
		int result =(numerator/denominator);
		
		System.out.println("The division result is:-"+result);
		
		}
		catch(Exception e) {
			
			System.out.println("Don't enter zero as the denominator");
		}
		
		
		System.out.println("Remaining 100000 lines of code");
	
		
		
		
		
	}

}

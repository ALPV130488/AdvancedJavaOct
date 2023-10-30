package com.controlstatements;

public class Switchexample {//Percentage & Grade Calculator
	
	public static void main(String[] args) {
		
		float mm = 600f;
		
		float om = 100f;
		
		float percentage = ((om/mm)*100);
		
		System.out.println("Your Percentage is:-"+percentage);//(10-100)
		
		
		//Grade Calculator
		
		
		int gpa=((int)percentage/10)%10;//(1-10)
		
		
		System.out.println("Your Grade is:-");
		
		
		
		switch(gpa) 
		
		{
		case 9:
		{
			System.out.println("distinction");
			break;
		}
		case 8:
		{
			System.out.println("excellent");
			break;
		}
		case 7:
		{
			System.out.println("good");
			break;
		}
		case 6:
		{
			System.out.println("average");
			break;
		}
		case 5:
		{
			
			System.out.println("pass");
			break;
		}
		
		
		default:
		{
			System.out.println("fail");
		}
		
		
		}
		
		
		
		
	}
	
	

}

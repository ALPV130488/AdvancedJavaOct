package com.assignments;

import java.util.Scanner;

public class FlowControls1 {
	
//	public FlowControls1() {
//		
//		System.out.println("this is the 7th question from the assignmets");
//	}

	public void program2a() {

		int temp = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= temp; j++) {

				if (j == temp)
					System.out.println("1");
				else if (j == 1)
					System.out.print("1");
				else
					System.out.print("0");

			}
			temp = temp + 2;
		}
	}

	public void program2b() {
		for (int i = 6; i >= 1; i--) {
			for (int j = i; j <= 6; j++)

				System.out.print(j - 1);
			System.out.println();

		}
	}

	public void program2c() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();

		}
	}

	public void program3() {

		int n = 15;

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("The sum :-" + sum);

	}

	public void program4() {
		int a = 251, b = 78, c = 87;

		int temp = a > b ? a : b;

		int result = temp > c ? temp : c;

		System.out.println("The greatest value is:-" + result);

	}
	
	public void foodService5() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pls give the rating from 1-6:-");
		
		int expression =scan.nextInt();
		
		switch(expression) {
		case 1:{
			System.out.println("Thank you ! we'll improve better");
			break;
		}
		case 2:{
			System.out.println("Thank you ! 2");
			break;
		}
		case 3:{
			System.out.println("Thank you !3");
			break;
		}
		case 4:{
			System.out.println("Thank you !4");
			break;
		}
		case 5:{
			System.out.println("Thank you !5");
			break;
		}
		case 6:{
			System.out.println("Thank you ! 6");
			break;
		}
		default:{
			System.out.println("Pls give the rating from 1-6");
			break;
		}
		
		}
	}
public void foodService6() {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("outstanding better good average poor");
		
		System.out.println("pls enter your feedback");
		String expression =scan.nextLine();
		
		switch(expression) {
		case "outstanding":{
			System.out.println("Thank you !outstanding ");
			break;
		}
		case "better":{
			System.out.println("Thank you ! better");
			break;
		}
		case "good":{
			System.out.println("Thank you !good");
			break;
		}
		case "average":{
			System.out.println("Thank you !average");
			break;
		}
		case "poor":{
			System.out.println("Thank you !poor");
			break;
		}
		
		default:{
			System.out.println("pls enter your feedback");
			break;
		}
		
		}
		
	}

	public void program10() {
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range of odd numbers:-");
		int n = scan.nextInt();
		
		System.out.println("The odd number are:-");
		for(int i=1;i<=(2*n);i++) {
			if(i%2==1) {
				
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("The sum is :-"+sum);
	}
	

	public static void main(String[] args) {

		FlowControls1 obj = new FlowControls1();

		obj.program10();;

	}

}

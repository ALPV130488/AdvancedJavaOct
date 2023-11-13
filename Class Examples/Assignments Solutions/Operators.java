package com.assignments;

public class Operators {

	public void reactangle() {
		int length = 2;

		int breadth = 4;

		System.out.println("Area of a Reactangle is:-" + (length * breadth));

		System.out.println("Perimeter of a Reactangle is:-" + (2 * (length + breadth)));
	}

	public void trianlge() {

		int len = 2, br = 3, he = 5;

		System.out.println("Perimeter of a triangle:-" + (2 + 3 + 5));

	}

	public void program3() {

		int n = 8 + 2345;

		n = n / 3; // n/=3;

		n = n % 5;

		n = n * 5;

		System.out.println(n);

	}

	public void program4() {

		int n = 8 + 2345;

		n /= 3;

		n %= 5;

		n *= 5;

		System.out.println(n);

	}

	public void program5() {

		if (23 == 45)
			System.out.println("The two values are equal");

		else
			System.out.println("The two values are not equal");
	}

	public void program6() {

		int result = 1, pow = 5;

		for (int i = 1; i <= 5; i++) {

			result *= 7;// result =result*7;
		}
		System.out.println(result);

		System.out.println("**********");

		while (pow != 0) {

			result *= 7;
			pow--;
		}
		System.out.println(result);
	}

	public void program7() {

		int a = 55, b = 70;

		if (a < 50 && a < b)
			System.out.println("The condition is satisfied");
		else
			System.out.println("The condition is not satisfied");
	}

	public void program8() {

		int a = 55, b = 70;

		if (a < 50 || a < b)
			System.out.println("The condition is satisfied");
		else
			System.out.println("The condition is not satisfied");
	}
	
	public void program10() {
		int a=6,b=8,temp=0;
		
		//using 3rd variable:-
		System.out.printf("before swapping:-a=%d   ,b=%d ",a,b);
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.printf("After swapping :-a=%d   ,b=%d",a,b);
		//withour using 3rd variable:-
		
//		b=a+b;
//		a=b-a;
//		b=b-a;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println();
		System.out.printf("After swapping :-a=%d   ,b=%d",a,b);
		
	}
	public void program11() {
		int i = 12345;
		
		int firstNumber=((i/10000)%10);
		int fourthNumber=((i/10)%10);
		
		System.out.printf("1st Number=%d   ,SecondNumber=%d",firstNumber,fourthNumber);
	
		System.out.println("sum of 1st and 4th is:-"+(firstNumber+fourthNumber));
	}

	public static void main(String[] args) {

		Operators obj = new Operators();

		obj.program11();

	}

}

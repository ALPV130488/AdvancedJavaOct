package com.exceptions;

class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 = 10;
			int b = 0;
			int c = a1 / b;
		} catch (ArithmeticException ae) {
			System.out.println("dont enter zero as denominater");
		}
		try {
			int a[] = new int[5];// 0,1,2,3,4 int a=123; int a[]={1,2,3,4,5,6,5,7,.....};
			a[2] = 1;
			a[5] = 6;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("array maximum size is 4");
		}
		
		finally {
			System.out.println("Iam from finally block");
		}
		System.out.println("remaining lines of code");
	}
}
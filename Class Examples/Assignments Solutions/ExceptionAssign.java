package com.assignments;

public class ExceptionAssign {

	public static int  check(int i) {
		if(i>0);
		else {
			throw new IllegalArgumentException();
		}
		
		return i;
	}
	public static void main(String[] args) {
		try {
//		check(-1);
		Class.forName("Scanner");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}

package oops;

public class MethodOverloading {
	
	public void add(int a,int b) {
		
	System.out.println("sum of two integers is:-"+(a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("sum of three integers is:-"+(a+b+c));
	}

	public void add(float a,int b) {
		System.out.println("sum of a float and an integer is:-"+(a+b));
	}
	
	public void add(int a, float b) {
		System.out.println("sum of an integer and a float is:-"+(a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("sum of two floats is:-"+(a+b));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.add('a','b');
	}
}

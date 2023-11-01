package oops;

class Parent7{
	
	public void dispalyHi() {
		System.out.println("Good Evening Everyone!!!");
	}
}

public class MethodOverriding extends Parent7 {
	
	@Override
	public void dispalyHi() {
		System.out.println("Good Morning Everyone!!!");
	}
	
	public static void main(String[] args) {
		
	MethodOverriding obj = new MethodOverriding();
	
	obj.dispalyHi();
		
	}

}

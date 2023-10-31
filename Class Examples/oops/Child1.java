package oops;

class Parent1{
	
	int parent = 45;
	
		public void displayMsg() {
		
		System.out.println("Iam from Parent1 class");
	}
	
	
}

class Parent2 extends Parent1{
	
		public void displayMsg() {
		
		System.out.println("Iam from Parent2 class");
	}
	
}

public class Child1 extends Parent2
{
	
	int child= 45;
	
	public void displayHi() 
	{
		System.out.println("Iam from Child class");
	}

	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		System.out.println(obj.child);
		
		obj.displayHi();
		
		System.out.println(obj.parent);
		
		obj.displayMsg();
		
		
		
		
		
	}
	
}

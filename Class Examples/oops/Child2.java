package oops;

interface Parent3{
	
	public void add(int a,int b);
}

interface Parent4{
	
	public void add(int a,int b);
}

public class Child2 implements Parent3,Parent4{

	@Override
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		obj.add(2, 3);
		
	}

}

package oops;

interface Parent5{//100% abstraction
	
	public void displayMsg();//interface abstract met
}

abstract class Parent6{//0%-100% abstraction
	
	public void displayHi() {
		System.out.println("Hi Everyone!!!");//abstract class concrete met
	}
	
	
	public void displayData() {};//abstract class abstract met
	
	public abstract void displayMsg();//abstract class abstract met
	
	
}


public class Child3 extends Parent6 {//0% 
	
	public void displayHi() {
		System.out.println("Hi Everyone!!!");//class concrete met
	}

	@Override
	public void displayMsg() {
		// TODO Auto-generated method stub
		
	}

}

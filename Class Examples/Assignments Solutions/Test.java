package com.assignments;

class Worker {
	String name;
	int SalaryRate;

	public void pay(int hours) {

		System.out.println("The week payment is:-"+SalaryRate * hours);
	}
}

class DailyWorker extends Worker {

	public DailyWorker() {
		
		int hour=56;
		int day =hour/8;
		super.SalaryRate = 100;
		pay(day);
	}

}

class SalariedWorker extends Worker {
	public SalariedWorker() {
		super.SalaryRate = 50;
		pay(40);
	}

}

public class Test extends SalariedWorker{

	public Test() {
	super();
	}
	public static void main(String[] args) {
		Test obj= new Test();
		
		
	}
	
}

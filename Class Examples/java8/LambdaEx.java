package com.java8;

public class LambdaEx {

	public static void main(String[] args) {
		//Normal method creation
		Flower flower = new Flower()

		{
			@Override
			public void flowerName(String color) {
				System.out.println("jasmine" + color);

			}
		};
		flower.flowerName("white");//method calling

		
//method created using lambda expression[()->{};]
		Flower flower1 =(color)-> {System.out.println("tulips"+ color);};
		
	
		flower1.flowerName("voilet");//method calling
	}
}



@FunctionalInterface
interface Flower {
	public void flowerName(String color);
}
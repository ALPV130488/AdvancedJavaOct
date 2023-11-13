package com.assignments;

public class Cuboid9 {
	
	int length,breadth,height;
	public Cuboid9() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cuboid9(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}


	public void surfaceArea() {
		System.out.println("Surface Area of a Cuboid:-"+( 2* (length*height + length*breadth+ breadth*height)));
	}
	public void volume() {
		System.out.println("Volume of a cuboid is:-"+(length*breadth*height));
	}
	
	public static void main(String[] args) {
		Cuboid9 obj = new Cuboid9(11,12,15);
		obj.surfaceArea();
		obj.volume();
	}
}

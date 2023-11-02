package com.keyword;

public class ThisEx {

	public ThisEx() {
		this("Gireesh");
	}
	public ThisEx(String name) {
		this("honey", "Dileep");
		System.out.println(name);
	}
	public ThisEx(String name1, String name2) {

		this("RaviKanth", "Apoorva", "Manjula");
		System.out.println(name1  +'\n'+name2);
	
	}
	public ThisEx(String name3, String name4, String name5) {
		this("Mahi", "Pranathi", "Bharath", "Lakshmi");
		System.out.println(name3 +'\n'+name4 +'\n'+name5);

	}
	public ThisEx(String name6, String name7, String name8, String name9) {
		System.out.println(name6 +'\n'+name7 +'\n'+name6+'\n'+name9);
		
	}

	public static void main(String[] args) {

		new ThisEx();

	}
}

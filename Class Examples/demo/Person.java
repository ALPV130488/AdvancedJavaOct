package com.demo;

public class Person {

	String name;

	byte age;

	String address;

	int idNumber;

	public Person(String name, byte age, String address, int idNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.idNumber = idNumber;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", idNumber=" + idNumber + "]";
	}

	public static void main(String[] args) {

		Person p1 = new Person("java", (byte) 12, "hyderabad", 1234);

		System.out.println(p1);

	}

}

package com.exceptions;


class AgeNotValidException extends Exception {
	private int age;

	public AgeNotValidException(int age)
	{
		this.age = age;
	}

	public String toString() {
		return "you are not eligable for vote  :" + age;
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValidException {
		if (age < 18)
			throw new AgeNotValidException(age);
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) {
		try {
			Exception6.validation(9);
		} catch (AgeNotValidException e) {
			
			e.printStackTrace();
			

		} finally {
			System.out.println("executes every time");
		}
		System.out.println("rest of the code...");
	}
}
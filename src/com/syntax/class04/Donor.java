package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 18;
		int weight = 210;

		if (age >= 18) {
			System.out.println("Welcome! Your age is verified.");
			if (weight > 110) {
				System.out.println("Your weight is matching procedure standards, you are eligible to be a donor.");
			} else {
				System.out.println("We are sorry, we cannot accept you as patient.");
			}
		}else {
			System.out.println("We are sorry, we cannot accept you as patient.");
		}
	}

}

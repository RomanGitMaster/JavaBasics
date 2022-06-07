package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		boolean userHasADiploma = true;
		if (userHasADiploma) {
			System.out.println("Congratulation!!!!");
			double gpa = 3.8;
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship");

			} else {
				System.out.println("You should have studied harder!");
			}

		} else {
			System.out.println("Get a degree!");
		}

		System.out.println("--------------------------------------------");

		double mortgageRate = 4.00;
		double mortgagePrice = 450000.00;

		if (mortgageRate > 4.5) {
			System.out.println("I wont buy a house");

		} else {
			System.out.println("Im buying a house");
		}
		if (mortgagePrice > 500000) {
			System.out.println("Take aloan ");
		} else {
			System.out.println("I will pay Cash");
		}

	}

}

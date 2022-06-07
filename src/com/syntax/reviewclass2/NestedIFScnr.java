package com.syntax.reviewclass2;

import java.util.Scanner;

public class NestedIFScnr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Account Balance");
		double accountBalance = scanner.nextDouble();
		System.out.println("Please enter the amount you want to lend");
		double amountToLend = scanner.nextDouble();

		if (accountBalance >= amountToLend) {
			System.out.println("Yes I can help you");
		} else {
			System.out.println("sorry , cant help you with that");

			System.out.println("-------------------------------------");

		}
		
		scanner.close();
	}

}

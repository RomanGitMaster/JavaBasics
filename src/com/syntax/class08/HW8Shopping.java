package com.syntax.class08;

import java.util.Scanner;

public class HW8Shopping {

	public static void main(String[] args) {
//Write a program to ask a user to enter item they want to buy and the price of that
//item. Every time user enters money, accumulate the amount and tell the user how		
//much is left to pay off. If user give more money program should return a change.		
//Whenever a user done with payments program should say “Thank you for		
//shopping!”		

		Scanner input = new Scanner(System.in);
		String item;
		double balance;
		double itemPrice;
		double money;
		double leftToPay = 0;
		System.out.println("Enter what you like to buy:");
		item = input.nextLine();
		System.out.println("Enter the price of this item:");
		itemPrice = input.nextDouble();
		System.out.println(item + "=" + itemPrice);
		System.out.println("Enter your money:");
		money = input.nextDouble();
		balance = itemPrice - money;

		do {
			balance = balance - leftToPay;
			if (balance > 0) {

				System.out.println("Your balance is:" + balance);
				System.out.println("Please enter more money:");
				leftToPay = input.nextInt();
			}

		} while (balance > 0);

		if (balance < 0) {
			System.out.println("Here is your change " + (-1 * balance) + " thanks for shopping, your Majesty!");
		} else {
			System.out.println("Thanks for shopping, your Majesty!");
		}
		input.close();
	}
}

package com.syntax.class06;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Is there a Sale?");
		String sale = input.next();

		double price = 0;
		double discount = 0;
		double priceWithDiscount = 0;
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What do you want to buy?");
			
			System.out.println("What is the price of the item you want to buy?");

			price = input.nextDouble();
			if (price <= 20) {
				discount = 10;
				priceWithDiscount = price - (price * 0.1);
			} else if (price > 20 && price <= 100) {
				discount = 20;
				priceWithDiscount = price - (price * 0.2);
			} else if (price > 100 && price <= 500) {
				discount = 30;
				priceWithDiscount = price - (price * 0.3);
			} else {
				discount = 50;
				priceWithDiscount = price - (price * 0.5);
			}
			System.out.println("After discount " + discount + " the price of the item reduced from " + price + " to "
					+ priceWithDiscount + ".");
		} else {
			System.out.println("No shopping today -_-");
		}
		input.close();
	}

}
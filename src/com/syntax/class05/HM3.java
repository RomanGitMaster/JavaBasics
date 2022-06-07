package com.syntax.class05;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter years worked:");
		int years = input.nextInt();
		if (years >= 5) {
			System.out.println("You are eligable for bonus!");
			System.out.println("Please enter your anual salary:");
			int salary = input.nextInt();
			if (salary >= 50000) {
				System.out.println("Your bonus is 5000$");
			} else {
				System.out.println("Your bonus is 3000$!");
			}
		} else {
			System.out.println("Sorry, you are not eligible for bonus.");
		}
		input.close();
	}

}

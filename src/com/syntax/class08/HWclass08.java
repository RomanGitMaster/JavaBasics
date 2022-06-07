package com.syntax.class08;

import java.util.Scanner;

public class HWclass08 {

	public static void main(String[] args) {

		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sumO = 0;
		int sumE = 0;
		
		System.out.println("Please provide starting number:");
		num1 = input.nextInt();
		System.out.println("Please provide ending number:");
		num2 = input.nextInt();

		
	 if (num2 > num1 && num2 > 0 && num1 >= 0) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					sumE += i;
				} else {
					sumO += i;
				}
			}
		} else if (num1 > num2 && num1 > 0 && num2 >= 0) {
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0) {
					sumE += i;
				} else {
					sumO += i;
				}
			}
		} else if (num2 < num1 && num2 < 0 && num1 <= 0) {
			for (int i = num1; i >= num2; i--) {
				if (i % (2) == 0) {
					sumE += i;
				} else {
					sumO += i;
				}
			}
		} else if (num1 < num2 && num1 < 0 && num2 <= 0) {
			for (int i = num2; i >= num1; i--) {
				if (i % (2) == 0) {
					sumE += (i);
				} else {
					sumO += (i);
				}
			}

		} else if (num2 < num1 && num2 < 0 && num1 > 0) {
			for (int i = num1; i >= num2; i--) {
				if (i % (2) == 0) {
					sumE += (i);
				} else {
					sumO += (i);
				}
			}
		} else if (num1 < num2 && num1 < 0 && num2 > 0) {
			for (int i = num2; i >= num1; i--) {
				if (i % (2) == 0) {
					sumE += (i);
				} else {
					sumO += (i);
				}
			}
		}
		System.out.println("Sum of even numbers is " + sumE + " and sum of odd numbers is " + sumO);
		input.close();
	}

}

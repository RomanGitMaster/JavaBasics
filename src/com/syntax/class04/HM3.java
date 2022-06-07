package com.syntax.class04;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1) {
			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println("Entered numbers are equal.");
		}
		input.close();
	}

}

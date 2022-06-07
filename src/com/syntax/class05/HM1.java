package com.syntax.class05;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What amount of loan is needed?");
		int amount = input.nextInt();
		if (amount < 200000 || amount == 200000) {
			System.out.println("Loan will be provided");
		} else {
			System.out.println("We are sorry, request is rejected");
		}
		input.close();
	}
}

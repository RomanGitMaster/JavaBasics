package com.syntax.class08;

import java.util.Scanner;

public class LoopsWithScanner {

	public static void main(String[] args) {

		/*
		 * declare a secret number
		 * 
		 * you want to ask user to guess your secret number
		 * 
		 * your code should keep asking untill user gets your secret number
		 * 
		 * once user gets the secret number-> you got it!
		 * 
		 */

		// int secret=9;
		// int n;
		// Scanner input=new Scanner(System.in);
		// do {
		// System.out.println("Guess the number!");
		// n=input.nextInt();

		// }while (secret!=n);
		// System.out.println("Got IT!");

		Scanner scan = new Scanner(System.in);

		String job;
		do {
			System.out.println("Did you get a job?");
			job = scan.next();

		} while (!job.equalsIgnoreCase("yes"));// we need ! in order for JAVA to see a false statement and exit the loop
		System.out.println("Congrats");

		System.out.println("-----------------------------------------------------------");

		// WHILE LOOP
		Scanner input = new Scanner(System.in);

		String offer;

		System.out.println("Did you get a job?");
		offer = input.next();
		while (!offer.equalsIgnoreCase("yes"))// we need ! in order for JAVA to see a false statement and exit the loop
		{
			System.out.println("Did you get a job?");
			offer = input.next();
		}
		System.out.println("Congrats");
		scan.close();
		input.close();

	}

}

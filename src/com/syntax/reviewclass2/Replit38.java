package com.syntax.reviewclass2;

import java.util.Scanner;

public class Replit38 {

	public static void main(String[] args) {

		/*
		 * Prompt user with a question: "Is it weekend?" If it is not a weekend -->
		 * subject="manual testing" Otherwise --> subject="Java"
		 * 
		 * Output:
		 * 
		 * Today you will be learning ____
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Is it weekend?");
		String weekend = input.next();
		String subject;
		if (weekend.equalsIgnoreCase("no")) {
			subject = "manual testing";
		} else {
			subject = "Java";
		}

		System.out.println("Today you will be learning " + subject);
		input.close();
	}

}

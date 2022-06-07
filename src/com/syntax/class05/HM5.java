package com.syntax.class05;

import java.util.Scanner;

public class HM5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your month of birth:");
		String month = input.next();
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
				|| month.equalsIgnoreCase("December")) {
			System.out.println(" You were born in season Winter");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("You were born in season Spring ");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in season Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in season Fall");
		}
		input.close();
	}

}

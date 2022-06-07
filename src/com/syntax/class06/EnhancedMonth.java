package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
//.equalsIgnoreCases just like .equals work only with STRING
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your month of birth:");
		String month = input.next();
		String season;
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
				|| month.equalsIgnoreCase("December")) {
			season = "Winter";

		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";

		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else {
			season = "Invalid";// <---- throw IF condition or syso, since it doesnt make any sense
		}
		if (!season.equals("Invalid")) {
			System.out.println("You were born in " + season);
		}
		input.close();
	}

}// finish this crap!

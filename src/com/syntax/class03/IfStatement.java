package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {

		/*
		 * Declare a variable rate. If the rate is more than 5 -> im not buying a
		 * house(EXAMPLE)
		 * 
		 */

		double mortgageRate = 4.5;
		if (mortgageRate > 5) {
			System.out.println("I am not buying a house");
		}

		/*
		 * declare two variables and check if num1 is bigger than num2 if the num1 is-
		 * -bigger than num2 ( true) output wil be followed If int not true( false) if
		 * wont display anything
		 */

		int num1 = 99;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);// <- when condition is met will follow IF
		}

		int t = 73;
		if (t > 75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study Java");// <-when condition is false will follow ELSE(Otherwise)
		}

		/*
		 * Use if to specify a block of code to be executed, if a specified condition is
		 * true Use else to specify a block of code to be executed, if the same
		 * condition is false
		 */
		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		char gender = 'm';
		if (gender == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");

			// check ASCII tables on google
		}

		String browser = "chrome";// <- if we change atleast one letter condition wont meet and it automatically
									// will go to ELSE
		// if it comes to Strings dont use relational operators
		if (browser.equals("chrome")) {
			System.out.println("I am not executing any tests cases");

		} else {
			System.out.println("I work hard all day long");
		}

		// cntrl+shift+F ----> formats the program neetly
	}
}

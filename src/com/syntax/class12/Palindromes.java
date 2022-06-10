package com.syntax.class12;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		/*
		 * Write code that will take in a String input and check to see if it is a
		 * palindrome or not.
		 * 
		 * A palindrome means that the characters are the same forwards and backwards,
		 * ignoring spaces.
		 * 
		 * Examples of palindromes:
		 * 
		 * racecar was it a car or a cat I saw never odd or even rats live on no evil
		 * star Your check should be case insensitive too. For example, "Bob" is a
		 * palindrome, despite the first B being capitalized.
		 * 
		 * Your program will print out "true" if it's a palindrome and "false" if not.
		 * 
		 */

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		givenString = givenString.toLowerCase().replace(" ", "");
		String reverse = "";
		boolean palindrome = true;

		for (int i = givenString.length() - 1; i >= 0; i--) {//<----way to print out string in reverse 
			reverse += givenString.charAt(i);
		}
		
		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		System.out.println(palindrome);
		inp.close();

		  
				/* or ANOTHER WAY to pirnt out in reverse if extra string is not needed (like String reverse)
				 * 
				 * for(int i=givenString.length()-1;i>=0;i--){
				 * System.print.out(givenString.charAt(i));
				 * }
				 */
		
		

	}

}

package com.syntax.class14;

import java.util.Scanner;

public class HW3 {

	
	void printIf(String givenString ) {
		
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
	
	}
	
	public static void main(String[] args) {
		//#3 Create a method that will print whether given String is palindrome or not.
     HW3 md=new HW3();
		Scanner scan=new Scanner(System.in);
		String givenString = scan.nextLine();
		md.printIf(givenString);
		scan.close();
	}

}

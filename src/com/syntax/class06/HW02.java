package com.syntax.class06;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		char g = input.next().charAt(0);
		String explanation;
		switch (g) {
		case 'A':
			explanation = "Excelent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not acceptable";
		}
		System.out.println("Grade " + g + " is " + explanation+"!");
		input.close();
	}

}

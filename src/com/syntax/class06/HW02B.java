package com.syntax.class06;

import java.util.Scanner;

public class HW02B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		char grade = input.next().charAt(0);
		String explanation;
		
		if (grade=='A') {
			explanation="Excelent";
		}else if (grade=='B') {
			explanation="Good";
		}else if (grade=='C') {
			explanation="Average";
		}else if (grade=='D') {
			explanation="Bad";
		}else {
			explanation="Not acceptable";
		}
		System.out.println("Grade "+grade+" is "+explanation+"!");
		
		input.close();
	}

}

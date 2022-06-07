package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score for quiz");
		int quiz = input.nextInt();
		System.out.println("Please enter your score for mid term");
		int midTerm = input.nextInt();
		System.out.println("Please enter your score for final");
		int fin = input.nextInt();
		int gradeS = (quiz + midTerm + fin) / 3;
		//System.out.println("Your grade is "+gradeS);<- option2
		//char gradeA;<- option2
		if (gradeS >= 90) {
			//gradeA='A';<- option2
			System.out.println("Grade is A");
		} else if (gradeS >= 70 && gradeS < 90) {
			//gradeA='B';<- option2
			System.out.println("Grade is B");
		} else if (gradeS >= 50 && gradeS < 70) {
			//gradeA='C';<- option2
			System.out.println("Grade is C");
		} else {
			//gradeA='F';<- option2
			System.out.println("Grade is F");
			
		}
		
		//System.out.println("you are "+gradeA+" student");
		//if (grade=='A'||grade=='B') {
			//System.out.println("You are doing great");
		//}esle {
			//System.out.println("please try better");
		//}
		input.close();
	}

	}


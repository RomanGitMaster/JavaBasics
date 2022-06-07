package com.syntax.class05;

import java.util.Scanner;

public class HM6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score for quiz");
		int quiz = input.nextInt();
		System.out.println("Please enter your score for mid term");
		int midTerm = input.nextInt();
		System.out.println("Please enter your score for final");
		int fin = input.nextInt();
		int grade = (quiz + midTerm + fin) / 3;
		if (grade >= 90) {
			System.out.println("Grade is A");
		} else if (grade >= 70 && grade < 90) {
			System.out.println("Grade is B");
		} else if (grade >= 50 && grade < 70) {
			System.out.println("Grade is C");
		} else {
			System.out.println("Grade is F");
		}
		input.close();
	}
	

}

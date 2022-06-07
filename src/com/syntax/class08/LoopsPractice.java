package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;

		}
		System.out.println(sum);// 1 3 6 10 15-< final answer is 15

		// write a program to find sum of all even and odd numbers from 1 to 70
		int sumE = 0;
		int sumO = 0;
		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sumE += i;
			} else {
				sumO += i;
			}

		}
		System.out.println("Sum of evens " + sumE);
		System.out.println("Sum of odds " + sumO);
		System.out.println("The sum of all odd and even numbers is " + (sumE + sumO));

		
		
		/*
		 * declare asecret number
		 * 
		 * you want to ask user to guess your secret number
		 * 
		 * your code should keep asking untill user gets your secret number
		 * 
		 * once user gets the secret number-> you got it!
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

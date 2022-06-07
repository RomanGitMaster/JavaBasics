package com.syntax.class05;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your city?");
		String city = input.next();
		System.out.println("Please enter the temperature");
		int t = input.nextInt();
		int resultC = (t - 32) * 5 / 9;
		System.out.println("The temperature in the " + city + " is " + resultC+" celsius");
		
		input.close();
	}
	
}

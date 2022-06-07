package com.syntax.class06;

import java.util.Scanner;

public class HW01B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your country?");
		String country = input.nextLine();
		String language;
		if (country.equalsIgnoreCase("Ukraine")) {
			language = "ukrainian";
		} else if (country.equalsIgnoreCase("Poland")) {
			language = "polish";
		} else if (country.equalsIgnoreCase("German")) {
			language = "deutsch";
		} else if (country.equalsIgnoreCase("USA")) {
			language = "english";
		} else if (country.equalsIgnoreCase("Japan")) {
			language = "japanese";
		} else {
			language = "unknown, please check your entry";
		}
		System.out.println("Your language is " + language + ".");
		input.close();
	}
}
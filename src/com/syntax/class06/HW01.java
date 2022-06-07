package com.syntax.class06;

import java.util.Scanner;

public class HW01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country:");
		String country, language;
		country = input.nextLine();

		switch (country) {
		case "USA":
			language = "english";
			break;
		case "Mexico":
			language = "spanish";
			break;
		case "Italy":
			language = "italian";
			break;
		case "Ukraine":
			language = "ukraininan";
			break;
		case "France":
			language = "french";
			break;
		case "Japan":
			language = "japanese";
			break;
		default:
			language = "unknown, please check your entry";

		}
		System.out.println("Your language is " + language+".");
		input.close();
	}
}

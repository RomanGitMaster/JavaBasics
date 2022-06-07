package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please state your day");
		String day = input.next();
		if (day.equals("Monday") || day.equals("Tueasday") || day.equals("Wednesday") || day.equals("Thursday")
				|| day.equals("Friday")) {
			System.out.println("It is a weekday");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("It is weekend day");
		} else {
			System.out.println(" Entry is invalid");
		}

		input.close();
	}

}

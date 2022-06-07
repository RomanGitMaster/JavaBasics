package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {

			System.out.println("Let me check how many doses you have");
			// NestedIf within If condition which add extra condition;
			// it wont be executed if If condition is false;

			if (dose == 1) {

				System.out.println("you need another dose");
			} else {
				System.out.println("You are fully vaccinated");
			}

		}

		System.out.println("____________________________________________________________");

		String month = "June";
		int day = 19;
		if (month.equals("May")) {

			System.out.println("Let me check what is today's day");
			if (day == 8) {
				System.out.println("Today is M Day after all");
			}
		} else if (month.equals("June")) {
			if (day == 19) {
				System.out.println("Today is Father's Day!");
			}
		}
	}
}

package com.syntax.reviewclass3;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Monday";
		String dayOfTheWeek;
		switch (day) {

		case "Monday":
			dayOfTheWeek = "Weekday";
			break;

		case "Tuesday":
			dayOfTheWeek = "Weekday";
			break;
		case "Wednesday":
			dayOfTheWeek = "Weekday";
			break;
		case "Thursday":
			dayOfTheWeek = "Weekday";
			break;
		case "Friday":
			dayOfTheWeek = "Weekday";
			break;
		case "Saturday":
			dayOfTheWeek = "Weekend";
			break;
		case "Sunday":
			dayOfTheWeek = "Weekend";
			break;
		default:
			dayOfTheWeek = "Invalid";

		}
		System.out.println(dayOfTheWeek);
	}

}

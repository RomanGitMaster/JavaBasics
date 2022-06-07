package com.syntax.reviewclass3;

public class ElseIfComparison2 {

	public static void main(String[] args) {
		String day="Friday";
		if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {
			System.out.println("Weekday");
		}else if("Saturday".equals(day)||"Sunday".equals(day)) {
			System.out.println("Weekend");
		}else {
			System.out.println("invalid day");
		}

	}

}

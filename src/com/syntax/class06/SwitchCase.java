package com.syntax.class06;



public class SwitchCase {

	public static void main(String[] args) {

		// case value :
		// Statements
		// break; // optional

		// case value :
		// Statements
		// break; // optional

		// You can have any number of case statements.
		// default : // Optional
		// Statements

		int day = 4;
		String name;

		if (day == 1) {
			name = "Monday";
		} else if (day == 2) {
			name = "Tuesday";
		} else if (day == 3) {
			name = "Wednesday";
		} else if (day == 4) {
			name = "Thursday";
		} else if (day == 5) {
			name = "Friday";
		} else if (day == 6) {
			name = "Saturday";
		} else if (day == 7) {
			name = "Sunday";
		} else {
			name = "Invalid";
		}

		System.out.println(name);

		System.out.println(" -------------------------------- ");
		switch (day) {

		case 1:
			System.out.println("Monday1");
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println( "Wednesday");
		
			
		
		}

		System.out.println(name);

		System.out.println("-------------------------------------------");
        
		char choice = 'Y'; //
		String meaning;
		// variable and matching cases MUST BE of the same type
		//switch does not allow to have duplicated cases
		
		switch (choice) {
		case 'Y':
			meaning = "Yes";
			break;
		case 'D':
			meaning = "None";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";

		}
		System.out.println(meaning);
		
		
	}

}

package com.syntax.reviewclass3;

public class ElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //when code executes but does not produce expected results we call these mistakes logical errors
        //when code does not even executes we call these mistakes syntax errors
		
		
		String day="Friday";// in non-primitive type variables we can store "null" wich means nothing
		if (day.equals("Monday")) {
			System.out.println("Weekday");
					}else if ("Tuesday".equals(day)) {
						System.out.println("Weekday");
					}else if ("Wednesday".equals(day)) {
						System.out.println("Weekday");
					}else if ("Thursday".equals(day)) {
						System.out.println("Weekday");
					}else if ("Friday".equals(day)) {
						System.out.println("Weekday");
					}else if ("Saturday".equals(day)) {
						System.out.println("Weekend");
					}else if ("Sunday".equals(day)) {
						System.out.println("Weekend");
						
						//or even faster below:
						
						if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {
							System.out.println("Weekday");
						}else {
							System.out.println("Weekend");
						}
					}// its more efficient and faster to execute else if instead of writing "if " condition every time
		             //because in else if when java finds the right answer she skipps everything else , while in if java keeps cheking every single if
		
		
		
		// if we have to test multiple condition we go with else if condition
		
		
		
		
		
		
		
	}

}

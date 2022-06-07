package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*LOGICAL OR: To test one or more conditions in 1 statement(block)
		 * true||true-->TRUE
		 * true||false-->TRUE
		 * false||true-->TRUE
		 * false|false-->FALSE
		 */
		
		

		/*Monday and Friday--> NO Class
		 * Tuesday and Wednesday-->manual
		 * Thursday--> review
		 * Saturday and Sunday--> Java
		 */
				String day="Monday";
		if (day.equals("Monday")||day.equals("Friday")) {
			System.out.println("I have no class");
		}else if (day.equals("Tuesday")||day.equals("Wednesday")) {
			System.out.println("I have manual class");
		}else if (day.equals("Thursday")){
			System.out.println("I have review class");
		}else if (day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I have Java class");
		}
	}

}
// 
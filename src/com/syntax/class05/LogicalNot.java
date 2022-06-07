package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		/*
		 * LOGICAL NOT: "=!" <---Reverse the condition with Boolean either True or False
		 */

		boolean boo = !true;// !operator reverse it to FALSE
		System.out.println(boo);
		System.out.println("----------------------");
		/*
		 * if there is no traffic-->i will reach work on time
		 */
		boolean traffic = false;
		if (!traffic) {
			System.out.println("I will reach work on time");
		}

		System.out.println("------------------------------");

		String name = "Emre";
		if (!name.equals("Reza")) {
			System.out.println("You are not Reza, and I need Reza");
		}

		
	}
}
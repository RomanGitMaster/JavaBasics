package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// String and Scanner are examples of NonPrimitives and always start with
		// upper case'

		// creating a scanner
		Scanner input = new Scanner(System.in);

		// send instruction to the console
		System.out.println("Please enter your name");

		// we nee to grab the value from console
		String name = input.next();// make sure to hit enter after typing info

		System.out.println(name);

		// let's send instruction
		System.out.println(name + " please enter your age");

		// need to capture and store age
		int age = input.nextInt();

		System.out.println(name + " is " + age + " years old ");
		
		//scanner(in our case "input" as a name).close();  <------- to close scanner for input from user
		
		input.close();
		
		
		
	}

}

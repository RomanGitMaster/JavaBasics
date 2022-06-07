package com.syntax.class04;
import java.util.Scanner;
public class Task0 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please state your age");
		int age=input.nextInt();
		if (age>=18) {
			System.out.println("Here is your driver license");
		}else {
			System.out.println("Please get a learner's permit");
		}
		input.close();
	}

}

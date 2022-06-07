package com.syntax.class04;

import java.util.Scanner;

public class HM2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first and last name:");
		String name = input.next();
		String lastName = input.next();
		System.out.println("Please enter  your state");
		String state = input.next();
		System.out.println("My name is " + name + " " + lastName + " and I live in state of " + state);
input.close();
	}
}

package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// Recap on Arrays

		String[] disney = { "Shrek", "Elsa", "Goofy", "Mulan" };
		int size = disney.length;
		System.out.println(size);// 4
		System.out.println(disney[1]);

		System.out.println("");

		System.out.println("Print out all elements using regular for loop:");
		System.out.println(" ");
		
		// to get all elements in the array
		for (int i = 0; i < disney.length; i++) {
			if (disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(disney[i] + " is my favorite character");
			} else {
				System.out.println(disney[i] + " ");
			}
		}

		System.out.println(" ");
		for (String character : disney) {
			if (character.equalsIgnoreCase("Mulan")) {
				System.out.println(character + " is my favorite character");
			} else {
				System.out.println(character + " ");
			}
		}
	}
}

package com.syntax.class10;

public class Replit68 {

	public static void main(String[] args) {
		// Write a program to print out the pattern:

		/*
		 * Expected output:
		 * 
		 * $$$$ 
		 * $  $ 
		 * $  $ 
		 * $$$$
		 */

		for (int i = 0; i < 4; i++) {

			System.out.print("$");
			for (int u = 0; u < 3; u++) {
				if (i == 1 && u == 0 || i == 1 && u == 1 || i == 2 && u == 0 || i == 2 && u == 1) {
					System.out.print(" ");
				} else {

					System.out.print("$");
				}

			}
			System.out.println(" ");

		}
	}
}
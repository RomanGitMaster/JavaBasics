package com.syntax.class10;

public class Replit69 {

	public static void main(String[] args) {
		// Write a program to print out the pattern:

		/*
		 * 1 2 3 4 5 6 7  
           1 2 3 4 5 6  
           1 2 3 4 5  
           1 2 3 4  
           1 2 3  
           1 2  
           1                   <--LOL
           1 2  
           1 2 3  
           1 2 3 4  
           1 2 3 4 5  
           1 2 3 4 5 6  
           1 2 3 4 5 6 7  
		 */

		for (int i = 0; i <= 12; i++) {
			System.out.print("1 ");
			for (int x = 2; x <= 7; x++) {
				if (i == 1 && x == 7 || i == 2 && x == 6 || i == 3 && x == 5 || i == 4 && x == 4 || i == 5 && x == 3
						|| i == 6 && x == 2 || i == 7 && x == 3 || i == 8 && x == 4 || i == 9 && x == 5
						|| i == 10 && x == 6 || i == 11 && x == 7) {
					break;
				} else {
					System.out.print(x + " ");
				}
			}System.out.println(" ");
		}
		
	}

}

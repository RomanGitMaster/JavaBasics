package com.syntax.class10;

public class Replit67 {

	public static void main(String[] args) {
		// Write a program to print out the pattern:
		/*
		 * 1 2 3 4 5 6 7 8 9 10                                        for(int g=1;g<=5;g++){
		 *                                                                 for (int h=2;h<=50;g++){
		 * 2 4 6 8 10 12 14 16 18 20                                           if(g==1&& h==2){
		 *                                                                        h+=1;
		 *                                                                        if(h==20){
		 *                                                                        break;
		 *                                                                       }
		 * 3 6 9 12 15 18 21 24 27 30                                           }
		 * 
		 * 4 8 12 16 20 24 28 32 36 40
		 * 
		 * 5 10 15 20 25 30 35 40 45 50 
		 * 
		 */
		for (int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		System.out.println(" ");
		for (int k = 2; k <= 20; k += 2) {
			System.out.print(k + " ");
		}
		System.out.println(" ");
		for (int x = 3; x <= 30; x += 3) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
		for (int i = 4; i <= 40; i += 4) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int e = 5; e <= 50; e += 5) {
			System.out.print(e + " ");
		}
	}
}
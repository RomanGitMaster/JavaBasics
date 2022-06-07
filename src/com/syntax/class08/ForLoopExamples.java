package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// i need to print numbers from 1 to 90
		for (int a = 1; a <= 90; a++) {
			System.out.println(a + " ");
		}

		/*
		 * start point end point increment/decrement
		 */
		System.out.println("-----------------------------------");

		for (int b = 60; b >= 10; b--) { //WE CAN USE "i" as our variable for loop
			System.out.println(b + " ");
		}
		System.out.println("-----------------------------------");

		// what is the output
		for (int g = 5; g <= 40; g += 5) {
			System.out.println(g + " ");
		}

		System.out.println("-----------------------------------");

		for (int s = 1; s <= 100; s++) {
			System.out.print(s + " ");
		}
		System.out.println("-----------------------------------");

		for (int e = 100; e >= 1; e--) {
			System.out.print(e + " ");
		}
		System.out.println("-----------------------------------");

		for (int d = 20; d >= 1; d -= 2) {
			System.out.print(d + " ");
		}
		System.out.println("-----------------------------------");
		for (int d1 = 20; d1 >= 1; d1--) {
			if (d1 % 2 == 0)
				System.out.println(d1 + " ");

		}
		System.out.println("-----------------------------------");
		for (int k = 20; k <= 50; k++) {
			if (k % 2 != 0) {
				System.out.println(k + " ");
			}
		}
			System.out.println("-----------------------------------");
		for (int k1 = 20; k1 <= 50; k1++) {
				if (k1 % 2 == 1)
					System.out.println(k1 + "");
			}
		
		
		
		
		
		}

	}



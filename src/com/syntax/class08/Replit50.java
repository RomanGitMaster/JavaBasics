package com.syntax.class08;

public class Replit50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sequance of 7
		// int i=7; // #1 is not very good since one extra value at the end
		// while( i<=98) {
		// i+=7;
		// System.out.println(i);
		// }
		int i = 7; // works fine
		while (i <= 98) {

			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}

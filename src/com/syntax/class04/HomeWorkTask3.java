package com.syntax.class04;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		int a = 26;
		int b = 14;
		int c = 28;

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is our largest number");
			} else {
				System.out.println(c + " is the largest");
			}
			
		} else {
			if (b > c) {
				System.out.println(b + " is our largest number");
			} else {
				System.out.println(c + " is the largest");
			}

		}
	}
}

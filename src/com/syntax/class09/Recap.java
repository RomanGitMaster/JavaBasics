package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello");

			for (int y = 1; y <= 3; y++) {

				continue;

			}

		}

		// how to create a multiplication table

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(x + "x" + y + "=" + (x * y));
			}
		}
	}

}

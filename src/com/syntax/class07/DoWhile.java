package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {

		// While loop first checks condition and then executes block of code
		int num = 1;
		while (num <= 3) {
			System.out.println(num + " ");
			num++;
		}

		System.out.println("----------------------");
		// DO WHILE first executes code and then checks the condition( thats why we see
		// always 1 output with DO WHILE
		int num1 = 10;
		do { // if condition is false Java RUN CODE ONCE with "do while", and will not go to
				// loop
			System.out.print(num1 + " ");// if condition is true Java run the code and goes to loop until condition is
											// false
			num1++;
		} while (num1 <= 3);

		// print numbers 1 to 30 using do while

		int s = 1;
		do {

			System.out.println(s + " ");
			s++;

		} while (s <= 30);

		// print numbers from 70 to 30 even

		int u = 70;
		do {
			System.out.println(u + " ");
			u--;
		} while (u >= 30) ;
		
			if (u % 2 == 0)	;

		}

	}


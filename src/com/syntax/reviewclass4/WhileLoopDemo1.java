package com.syntax.reviewclass4;

import java.util.Scanner;

public class WhileLoopDemo1 {

	public static void main(String[] args) {

		int y = 1;
		while (y <= 10) {
			System.out.println(y);
			y++;
		}
		
		
		// take the input from the user
		//increment it by 2 and pprint it
		//if value is 10 terminate the program
		Scanner scanner = new Scanner(System.in);
		int  x=0;
		while(x!=10) {
			System.out.println("Please enter the number");
			x=scanner.nextInt();
			x+=2;
			System.out.println(x);
		}
		scanner.close();
	}
}
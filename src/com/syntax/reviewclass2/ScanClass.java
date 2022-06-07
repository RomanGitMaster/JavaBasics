package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScanClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = scanner.nextInt();

		System.out.println("Please enter your name");
		String name = scanner.next(); // 

		

		System.out.println(age + name); //
		scanner.close();
	}

}

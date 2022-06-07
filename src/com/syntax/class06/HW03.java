package com.syntax.class06;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("SUPER-DUPER CALCULATOR O_o'");
		double num1, num2;
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		System.out.println("Chose operator");
		char oprt = input.next().charAt(0);
		double result = 0;

		if (oprt == '+') {
			result = num1 + num2;
		} else if (oprt == '-') {
			result = num1 - num2;
		} else if (oprt == '*') {
			result = num1 * num2;
		} else if (oprt == '/') {
			result = num1 / num2;
		} else {
			System.out.println("wrong operator, mortal");
		}
		System.out.println("Result " + result);
		input.close();
		
		
		
	}
}

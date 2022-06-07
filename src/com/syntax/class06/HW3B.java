package com.syntax.class06;

import java.util.Scanner;

public class HW3B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("SUPER-DUPER CALCULATOR O_o'");
		double num1, num2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("Enter your opeartor:");
		char oprt = input.next().charAt(0);
		double rslt = 0;

		switch (oprt) {
		case '+':
			rslt = num1 + num2;
			break;
		case '-':
			rslt = num1 - num2;
			break;
		case '*':
			rslt = num1 * num2;
			break;
		case '/':
			rslt = num1 / num2;
			break;
		default:
			System.out.println("wrong operator");

		}
		if (oprt == '+' || oprt == '-' || oprt == '/' || oprt == '*') {
			System.out.println(rslt);
		}
		input.close();

	}

}

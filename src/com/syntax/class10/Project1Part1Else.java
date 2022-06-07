package com.syntax.class10;

import java.util.Scanner;

public class Project1Part1Else {

	public static void main(String[] args) {
		// #1. Using Scanner create an array of integer values. After the array is
		// created, calculate the sum of all stored
		// elements in that array.
		Scanner input = new Scanner(System.in);
		int[] set = new int[5];

		int sum = 0;
		for (int i = 0; i < set.length; i++) {
			System.out.println("Enter Value");
			set[i] = input.nextInt();
			sum += set[i];
		}
		System.out.println("The sum of all numbers in array is " + sum);
        input.close();
		/*#2
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		System.out.println("-----------------------------------------");
		/*#4
		 * Create a 2D array or integer type where you will store odd and even
		 * numbers. Develop a program which will identify/print the even numbers only.
		 */

		int[][] num = { { 3, 6, 4, 8, 5 }, { 7, 9, 2, 4, 8 }, { 8, 3, 1, 5, 4 } };
		for (int a = 0; a < num.length; a++) {
			for (int e = 0; e < num[a].length; e++) {
				if (num[a][e] % 2 == 0) {
					System.out.print(num[a][e] + " ");
				}
			}
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
        /*#5
         * Create a 2D array of integers.
         * Develop a program which will calculate the sum of even
         *  and odd numbers for that array.
         */
		int[][] nums = { { 3, 6, 4, 8, 5 }, { 7, 9, 2, 4, 8 }, { 8, 3, 1, 5, 4 } };
         int sumE=0;
         int sumO=0;
		for (int u = 0; u < nums.length; u++) {
			for (int o = 0; o < nums[u].length; o++) {
				if(nums[u][o]%2==0) {
					sumE+=nums[u][o];
				}else if(nums[u][o]%2!=0) {
					sumO+=nums[u][o];
				}

			}
		}System.out.println("The sum of even numbers is 2D array is "+sumE+" and sum of odd numbers is "+sumO);

	}
}

package com.syntax.class10;

public class Replit70 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88
		 * 
		 * Print only values that stored with even index including 0.
		 * 
		 * Output:45 12 55 23 88
		 */

		int[] nums = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || i % 2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
		/*
		 * REPLIT 72: Write a program that creates an array with the following values{s,
		 * a, y, b, n, c, t, d, a, e, x}
		 * 
		 * Print the values so the output should look like below
		 * 
		 * Output: syntax
		 */
		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
		for (int i = 0; i < letters.length; i++) {
			if (i == 0 || i % 2 == 0) {
				System.out.print(letters[i]);

			}
		}

		/*
		 * REPLIT 74: Write a program that creates an array of integers of size 11. Add
		 * the years 2010 to 2020 to your array one by one using a for loop and then
		 * print all those values.
		 * 
		 * Example: 2010 2011 2012 2013 2014 2015 2016 2017 2018 2019 2020
		 */

		int[] years = new int[11];
		years[0] = 2010;
		years[1] = 2011;
		years[2] = 2012;
		years[3] = 2013;
		years[4] = 2014;
		years[5] = 2015;
		years[6] = 2016;
		years[7] = 2017;
		years[8] = 2018;
		years[9] = 2019;
		years[10] = 2020;

		for (int a = 0; a < years.length; a++) {

			System.out.println(years[a]);

		}
		
	}
}
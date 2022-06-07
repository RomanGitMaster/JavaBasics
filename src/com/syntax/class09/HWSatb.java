package com.syntax.class09;

public class HWSatb {

	public static void main(String[] args) {
       //Create an array on integers and calculate the sum of all elements in an array
		int sum = 0;
		int[] num = { 3, 4, 5, 6, 7, 8, 9, 12, 15 };
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("**************************************");

		int sum2 = 0;
		int[] num2 = { 18, 4, 7, 6, 13, 8, 9, 12, 23 };

		for (int g = 0; g < num2.length; g++) {
			sum2 += num2[g];
		}
		System.out.println(sum2);
	}

}

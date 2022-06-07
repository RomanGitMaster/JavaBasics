package com.syntax.class09;

public class HWSat {

	public static void main(String[] args) {
  //Create an array to store double values and then print all elements using 2 different loops
		double[] dec = { 2.5, 3.5, 4.5, 5.5 };
		int x = 0;
		while (x < dec.length) {
			System.out.println(dec[x] + " ");
			x++;
		}
		System.out.println("***********************************");
		for (double i : dec) {
			System.out.println(i + " ");
		}
		

	}

}

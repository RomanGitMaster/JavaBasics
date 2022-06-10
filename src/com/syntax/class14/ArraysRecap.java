package com.syntax.class14;

public class ArraysRecap {

	public static void main(String[] args) {
		// Recap on Arrrays
		
		int[][]nums= {
				{12,13,14,15,16},
				{21,22,23,24,25},
				{31,32,32,34,35}
		};
		
		for( int row=0;row<nums.length;row++) {
			for (int col=0;col<nums[row].length;col++) {
				System.out.println(nums[row][col]);
			}
		}
	}

}

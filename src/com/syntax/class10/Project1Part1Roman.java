package com.syntax.class10;

public class Project1Part1Roman {

	public static void main(String[] args) {
		// 9. Maximum and minimum number in the array?
		
		int[] number= {54,38,76,29,45};
		int max=number[0];
	int min=number[0];
		for (int i=1;i<number.length;i++) {
			if (number[i]>max) {
				max=number[i];
			}else if (number[i]<min) {
				min=number[i];
				
			}
		}System.out.println("Maximum number in array is "+max+" and minimum number is "+min );
		
		//3. Create a 2D array of integer values. Print the sum of all numbers.

		int[][] nums= {
				{10,20,30,40,50},
				{60,70,80,90},
				{110,45,125,65,15}
		};
		int sum=0;
		for (int x=0;x<nums.length;x++) {
			for(int y=0;y<nums[x].length;y++) {
			sum+=nums[x][y];	
				
			}
		}System.out.println("The sum of all numbers in 2D array is "+sum);
	}

}

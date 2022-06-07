package com.syntax.class10;

public class Replit75 {

	public static void main(String[] args) {
		/*
		 * Using the following array.

           {45, 78, 12, 67, 55, 89, 23, 77, 88}

           Create a for loop to extract values from that array so your output looks as below:

           **Expected Output:**
           78 55 77
           Note: Find out what is the start point an how much you need to increment to get the result.
		 
		 */
      int[]nums={45, 78, 12, 67, 55, 89, 23, 77, 88};
      
      for (int i=1;i<nums.length;i+=3) {
    	  System.out.print(nums[i]+" ");
      }
      
	}

}

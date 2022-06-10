package com.syntax.class10;

public class Replit85 {

	public static void main(String[] args) {
		// For you to do:

//Write a program that sums all numbers that are on even index and on even row.

//Expected Output:

//-4
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int sum=0;
			 for (int row=0;row<a.length;row++){
	       for( int col=0;col<a[row].length;col++){
	         if(row%2==0&&col%2==0)
	         sum+=a[row][col];
	       }
	     }System.out.println(sum);
	}

}

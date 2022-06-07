package com.syntax.class10;

import java.util.Scanner;

public class Replit78 {

	public static void main(String[] args) {
/*
 * Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below

Example:

Input:

1

2

3

4

5

Output:
10
20
30
40
50
		 */

		Scanner scan=new Scanner(System.in);
	    int[] array=new int[5];
	    for (int i =0;i<array.length;i++){
	      array[i]=scan.nextInt();
	      }
	    for(int i=0;i<array.length;i++){
	      System.out.println(array[i]*10);
	    }
		
		scan.close();
	}

}

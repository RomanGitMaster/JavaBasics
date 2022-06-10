package com.syntax.class10;

public class Replit81 {

	public static void main(String[] args) {
	/*#81
* Write a program that prints the highest value in the array.

Expected Output: input [5,4,8]

8
	 */
		
		
		
		 int[]threenums={5,4,8};
		   int highest=0;
		      for(int i=0;i<threenums.length;i++){
		        if(threenums[i]>highest){
		          highest=threenums[i];
		        }
		      }System.out.println(highest);
		       

	System.out.println("---------------------------------------------------");
		
/*#82
 * Write a program that will print the sum of all elements in 2D array.

Expected Output:

-9
		 */

		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	    int sum9=0;
		for(int i=0;i<a.length;i++){
	    for (int j=0;j<a[i].length;j++){
	      sum9+=a[i][j];
	    }
	  }System.out.println(sum9);
	  
/*#83
* Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

For example, if we run rowSums for the following 2D array:

{
{1,1,2}, //sum = 4
{3,1,2}, //sum = 6
{3,5,3}, //sum = 11
{0,1,2}  //sum = 3
}
Then we should get the following array back:

4
6
11
3
	   */
	  
	  
		
	}

}

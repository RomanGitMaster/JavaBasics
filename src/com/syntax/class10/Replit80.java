package com.syntax.class10;

public class Replit80 {

	public static void main(String[] args) {
		double[][]nums={
			    {1.4,2.0,3.3,2.0},
			    {4.0,1.5,6.1,1.0},
			    {1.2,3.1,4.0,1.6}
			  };
				for(int i=0;i<nums.length;i++){
			 
			  
			    for(int j=0;j<nums[i].length;j++){
			    	
			      System.out.print(nums[i][j]+" ");
			  }
			  System.out.println();
				}
				
				
/*ORR
 * double[][]nums={
    {1.4,2.0,3.3,2.0},
    {4.0,1.5,6.1,1.0},
    {1.2,3.1,4.0,1.6}
  };
    
	for(double[]row:nums){
   
    for(double col:row){
      System.out.print((col*2)+" ");
    }
     System.out.println();
  }
*/
	}

}

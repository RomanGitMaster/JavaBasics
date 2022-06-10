package com.syntax.class10;

public class Replit84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int sum=0;
	for (int row=0;row<a.length;row++){
	  for (int col=0;col<a[row].length;col++){
	   if (a[row][col]%2!=0&&a[row][col]<0){
	      sum+=1;
	    }
	  }System.out.println(sum);
	  }
	
		
		int sum1=0;
		for(int i=0;i<a.length;i++){
	    for (int j=0;j<a[i].length;j++){
	    	if(a[i][j]%2!=0&&a[i][j]<0)
	      sum1+=1;
	    }
	  }System.out.println(sum1);
	  
	}
	}



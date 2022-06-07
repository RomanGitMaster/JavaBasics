package com.syntax.class10;
import java.util.Scanner;
public class Replit77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[]nums=new int[5];
		    for(int i=0;i<nums.length;i++){
		      nums[i]=input.nextInt();
		      System.out.println();
		      }
		  for (int i=nums.length-1;i>=0;i--){
		  System.out.println(nums[i]);
		  }
		  input.close();
	}

}

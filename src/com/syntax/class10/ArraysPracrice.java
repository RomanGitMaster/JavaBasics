package com.syntax.class10;

public class ArraysPracrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	
		
		//Create an array to store char values and then print those in reverse order
		int[] num = { 3, 4, 5, 6, 7, 8, 9, 12, 15 };
		int max=num[0];
		for (int i =1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
				
			}
			
		}
		System.out.println(max);
		
		max=num[0];
		for (int n:num) {
			if(n>max) {
				max=n;
			}
		}
		System.out.println(max);
		
		
		
		System.out.println("-----------------------------");
		
		
		//Create an array to store char values and then print those in reverse order
		char[]s= {'A','B','C','D','E','F'};
		for (int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

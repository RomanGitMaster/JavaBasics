package com.syntax.class08;

public class BreakKeyWords {

	public static void main(String[] args) {
		
		//break - breaks block of code
		
		
		
		for (int i=1;i<=5; i++) {
			System.out.println("Hello");
			if (i==2){
				break;
			}
			}
		
		
		boolean summer=true;
		int temp=95;
		 while(summer) {
			 
			 if (temp<70) {
				 System.out.println("Its not hot anymore");
				 break;
			 }
			 System.out.println("It is hot");
			 temp-=10;
		 }
		
		
		
	}

}

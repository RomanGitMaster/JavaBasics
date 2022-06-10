package com.syntax.class14;

public class HW1 {
	 void larger(int x,int y) {
		 if(x>y) {
			 System.out.println("Larger number is "+x);
		 }else {
			 System.out.println("Larger number is "+y);
		 }
		
			
		}
	 void print(int s) {
		 if(s%2==0) {
			 System.out.println("Number is Even");
		 }else {
			 System.out.println("Number is Odd");
		 }
	 }
	
	public static void main(String[] args) {
		//#1  Create a method that will take 2 parameters as a numbers and prints which number is larger.
		//#2  Create a method that will take a number and prints whether the number is even or odd.
		
HW1 md=new HW1();
md.larger(8, 12);//#1
md.print(165);//#2

	}

}

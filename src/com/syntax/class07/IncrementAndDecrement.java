package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=10;
		
		x=x+1;
		x+=1;
		
		System.out.println(x);
		
		x++; // increments value of a variable by 1
		
		System.out.println(x);
		
		x--; //decrements a value by 1
		
		System.out.println(x);
		
		// increment and decrement operators work only with variable
		
		// 10++; <----invalid, you need a variable with value and only then use IandD operators
				
		int num=100;
		num++;
		System.out.println(num);
		
		System.out.println("----------------------");
		// post increment 
		int  num0=10;
		int result=num0++;// first we assign value and then increment
		System.out.println("Value of num0= "+num0);
		System.out.println("Value of result= "+result);
		
		
		//pre increement
		
		int num9=10;
		int result1=++num9;//(first we increment and then assign
		System.out.println("Value of num0= "+num9);
		System.out.println("Value of result= "+result1);
	}

}

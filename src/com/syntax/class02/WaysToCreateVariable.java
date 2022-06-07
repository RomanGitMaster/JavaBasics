package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		
		//to create a variable we need 2 things: data type and name
		
		/*
		 * First way to create a variable
		 * Date type name = value
		 */
		// declare the value and initialized it
		int temperature=60;
		
		/*
		 * Second way is done in 2 steps:
		 * create a variable (DataType and name)
		 * assign the value
		 */
		
		int sum;// create a variable or declare a variable
		sum=30; // assign the value,it is  useful if we don't know the value right the way
		System.out.println(sum);
		sum=50; //reassigning the value
		
		int num1, num2, num3; // create 3 variables of int type 
		num1=10;//assign the value
		num2=20;//assign the value
		num3=30;//assign the value
		
		System.out.println(sum);// we already reassigned sum from 30 to 50, thats why we got 50 at the end 
		
		
	}

}

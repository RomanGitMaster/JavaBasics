package com.syntax.class03;

public class RelatinalOperators {

	public static void main(String[] args) {
		
		//>,<,>=,<=,==,!=;
		
		int num1=20;
		int num2=22;
		System.out.println(num1>num2);//false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true 
		System.out.println(num1==num2);//false
		System.out.println(num1=num2); // here we actually reassigning value of  int num1, thats why we get 22
		
		System.out.println(num1==num2);
		
		boolean result=100>200;
		System.out.println(result);
		
		
		
		int num3=10;
		int num4=11;
		
		result=num3==num4;//if num3 equals to num4
		System.out.println(result);// false
		
		result=num3!=num4; // check if num3 not equal to num4
		System.out.println(result);
	}

}

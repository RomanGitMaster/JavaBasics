package com.syntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		System.out.println(a+b+c+d);//30HelloHi
		System.out.println(a+c+b+d);//10Hello20Hi
		System.out.println(c+d+a+b);// Java reads iyt as concan instead of string and arithmetic , HelloHi1020
		System.out.println(c+d+(a+b));// by adding parenthesis we specify the function and we get HelloHi30
		
		boolean boo=true;
		System.out.println(c+boo);
		
		//Operators:+,-,/,*;
		
		
		
	}
}

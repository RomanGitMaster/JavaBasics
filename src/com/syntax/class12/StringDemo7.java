package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// index meter
		String str="I am always confused";
		
		
		System.out.println(str.indexOf('c'));//searches for index under letter 'c'
		System.out.println(str.indexOf("always"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('z'));// if the char ,symbol, is not in  a string it will gives us-1

		
		
	}

}

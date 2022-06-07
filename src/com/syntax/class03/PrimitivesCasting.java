package com.syntax.class03;

public class PrimitivesCasting {

	//ctrc+space-->autocomplete
	public static void main(String[] args) {

		
		int i=100;
		double d=100;
		
		System.out.println(i);//100	
		System.out.println(d);//100.0
	
		
		// Casting -is converting of one type value into another
		
		
		
		
		//widening/implicit(automatically)- converting of smaller data type to bigger  byte->short-->int->long->float->double ( it happens automatically)
		
		// int is smaller value and its totally fine to store it in bigger data type as Long (long l=10000;)
		
	    // but fitting bigger value in smaller data type is a problem byte p=130; <- wont work 
		
	
		
		
		
		/*
		 * Narrowing/Explicit/Manually double->float->long->int->short->byte)
		 * Type mismatch: cannot convert from double to int -> int x=100.99;
		 */
		int x=(int)99.99;//narrowing, manual way of doing it, but we will have potential loss of information , in our case .99
		System.out.println(x);
	
		//byte b=130; <-error , so we do narrowing manually
		byte b=(byte)130;
		System.out.println(b);
		
		
		
		
		
		
	}
		
	

}

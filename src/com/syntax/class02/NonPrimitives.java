package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
	String name="John";
	String lastName="Smith";
	
	long phone=1234567890l;
	int age=30;
	String city="Miami";
	
	
	//xxx-xxx-xxxx where dashes are not specified
	
	String phoneNumber="123-456-7890";
	
	String address="123 Washington str";
	
	//shortcut for printing: syso+ctrl+--> hit enter
	
	/*we use + -> works on cocatenation operator
	 * to attach string to string we can use + 
	 * String to int
	 * attach String to double
	 * to any other types
	 * 
	 */
	
    	System.out.println(name+" "+lastName);// John Smith in order to add space we use double quotes betwen string 
	
	//John Smith lives in Miami
		System.out.println(name+" lives in "+city);

	//John is 30 years old
		System.out.println(name+" is "+age+" years old");
	
	/*
	 *Rules for Identifiers:
	 *1)no spaces
	 *2)no key words
	 *3)no starting with numbers but can contain it (name1)
	 *4)no starting with special charecters (for example name!), except _,$
	 *
	 */
		//int num%=20; error
	double $price=3.99; //works just fine
	float f_=2.09f; //works just fine
	
	
	/*
	 * Naming Conventions ( look up at java oracle naming conventions) 
	 * 1) follow camel casing
	 * 2) variables/methods names should start with lowercase and then follow camel casing
	 * 3) class names should start with uppercase
	 */
	
		String mycity="Tysons";
	
	
	}

}

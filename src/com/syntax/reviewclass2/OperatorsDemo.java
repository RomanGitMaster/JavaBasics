package com.syntax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		
	//Arithmatic OPERATORS IN JAVA:
		//+, -,/,*,%;	
		
    //LOGICAL operators: == != >= <=;
	
    //Relational operators: < >
    //Equality opearator:  ==          (<= >= !=    <-Hybrid operators)
		
		
		int num=10;
		int num2=10;
		System.out.println(num>=num2);//num>num2=f or num=num2=>t f+t=t
		
		//whole numbers -> 0- infinty, Negative Infinity to Positive Infinity
		System.out.println(Long.MAX_VALUE); // gives us the maximum range
		System.out.println(Long.MIN_VALUE); // gives us the smallest range
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num/num2);// dividing numbers
		System.out.println(num%num2); // looking for reminder in division
		
		System.out.println(10.0/3);
		System.out.println((int)10.3/3);
		
		System.out.println(10.5*3);
	}

}

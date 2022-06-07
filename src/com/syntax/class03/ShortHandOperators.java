package com.syntax.class03;

public class ShortHandOperators {
public static void main(String[] args) {
	
	int num=100;
	num=num+100;
	System.out.println(num);//200
	num=num+50;
	System.out.println(num);//250
	
	//shorter way of assigning the value 
	num+=100;//instead of num=num+100;
	
	//same works with sub, div, mult, rem: num-=, num/=,num*=,num%=;
	num-=10;
	System.out.println(num);
	num/=10;
	num*=2;
	System.out.println(num);
	num%=2;
	System.out.println(num);
	
	int a=10;
	int b=20;
	int c=30;
	
	a+=b;
	System.out.println(a);
	
	a+=b+c;
	System.out.println(a);
	
	a*=10;
	System.out.println(a);
	
	
}
}

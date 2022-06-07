package com.syntax.class02;

public class HomeWorkClass2 {

	public static void main(String[] args) {
		//1
		float decimal=4.5f;
		float decimal1=2.2f;
		float sum=decimal+decimal1;
		float sub=decimal-decimal1;
		float mult=decimal*decimal1;
		float div=decimal/decimal1;
		System.out.println("The sum of 2 numbers "+decimal+" and "+decimal1+" is equal to "+sum);
		System.out.println("The difference of 2 numbers "+decimal+" and "+ decimal1+" is equal to "+sub);
		System.out.println("The product of 2 numbers "+decimal+" and "+decimal1+" is equal to "+mult);
		System.out.println("The quotient of 2 numbers "+decimal+" and "+decimal1+" is equal to "+div);
		//2
		double a=3.9;
		double squareA=a*a;
		System.out.println("The square of the "+a+" is "+squareA);
		//3
		int w=5;
		int h=8;
		int perimeter=w+h+w+h;
		int area=w*h;
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to "+perimeter+" and the area is "+area);
		
		
	}

}

package com.syntax.class09;

public class Array {

	public static void main(String[] args) {

//Array is a container that can store multiple values

//		int a =100;
//		int[]b (the all values are stored based on indexes-->b[0],b[1],b[2],b[3] )
//		        (4 elements)
//		90       85       75             100
//		b[0]     b[1]     b[2]          b[3] 

		// Create an array
		int[] b = new int[4];

		// STore values
		b[0] = 90;
		b[1] = 85;
		b[2] = 75;
		b[3] = 100;

		// access value from my array
		System.out.println(b[1]);
		b[3] += 100;
		System.out.println(b[1] + b[3]);

		// We need to create an array of my classmates names
		// When we create an array we MUST specify the size(how many elements
		String[] classMates = new String[5];
		// how value are stored--> stored based on index
		classMates[0] = "Khrystyna";
		classMates[1] = "Zameer";
		classMates[2] = "Elexia";
		classMates[3] = "Oleg";
		classMates[4] = "Adem";

		System.out.println("My classmate name is " + classMates[3]);
System.out.println("---------------------------------------------------");
		// I want to store prices in array

		double[] price = new double[3];// since we stated size [3] java will give error
		//price[3]= 1.00;         <----if we added extra  java.lang.ArrayIndexOutOfBoundsException 
		price[0] = 1.99;
		price[1] = 2.99;
		price[2] = 3.99;
		
		System.out.println(price[0]);
//arrays are fixed in size		
// During run time Java cannot increase or decrease a size of an array
//indexes must start with [0] and so on
		
		String[] fruits= {"mango","apple","kiwi","pear"};
		System.out.println(fruits[2]);
		
		System.out.println("My favorite fruit is "+fruits[0]);
		
		
		
		
		System.out.println("------------------------------------");
		// i want to find a size of an array/how many elements?
		int size=fruits.length;
		System.out.println(size);
		System.out.println("------------------------------");
		
		
		
		
		char[] g=new char[6];
		g[0]='A';
		g[1]='B';
		g[2]='C';
		g[3]='D';
		g[4]='E';
		g[5]='F';
		System.out.println(g[1]);
		
		char[]s= {'A','B','C','D','E','F'};
		
		System.out.println(s[1]);
		
		String[] w= {"Java","Saturday","Day","coding","is"};
		System.out.println(w[1]+" "+w[4]+" "+w[0]+" "+w[3]+" "+w[2]);
		
		
		
	}

}

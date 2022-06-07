package com.syntax.class10;

public class SecondArray {

	public static void main(String[] args) {
		
 // 2d Array - two dimensional Array
		
		int [][] numbers=new int[3][4];
		// 1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		// 2 row
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		
		// 3 row
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		
		System.out.println(numbers[1][3]);//4
		System.out.println(numbers[0][1]);//20
		int rows=numbers.length;// give the # of 1st row;
		
		System.out.println(rows);
		
		
		//Create 2D array of States
		/*1st Array->all cities of NY state
		 *2nd Array->all cities of CA state
		 *3rd Array->all cities of Fl state
		 *4th Array->all cities of VA state
		
		 */
		String[][] usa= {
				{"New York","Albany","Buffalo"},
				{"Los Angeles","San Francisco","San Jose","San Diego", "Reading"},
				{"Miami","Orlando","Niceville","Tampa"},
				{"Mclean", "Richmond","Leesburg"}
		};
		System.out.println(usa[1][2]);
		System.out.println("i want to go "+usa[2][0]);//Miami
		//I want to see how many elements inside my first array
		int elem1array=usa[0].length;
		System.out.println("# of lelemnts in 1st array = "+elem1array);
		// I want to see how many elements inside my second array
		int col1Of1row=usa[1].length;
		System.out.println("# of lelemnts in 1st array = "+col1Of1row);
		//outter loop iterates over rows
		//inner loops iterates over columns
		
		for (int row=0;row<usa.length;row++) {
			for(int col=0;col<usa[0].length;col++) {
				System.out.println(usa[row][col]);
			}
		}
		
		System.out.println("                            ");
		for (String[] state:usa) {
			for(String city:state) {
				System.out.print(city+" ");
			}
		}
	}

}

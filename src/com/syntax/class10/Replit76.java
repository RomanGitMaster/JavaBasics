package com.syntax.class10;

import java.util.Scanner;

public class Replit76 {

	public static void main(String[] args) {
/*
* Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

Example:

Please enter day 1 of the week

Sunday

Please enter day 2 of the week

Monday

Please enter day 3 of the week

Tuesday etc

Example Output:

Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
*/
		
		
		
/*String[]array=new String[7];   
Scanner input=new Scanner(System.in);
 System.out.println("Please enter day 1 of the week");
		   String day1=input.next();
		   System.out.println("Please enter day 2 of the week");
		   String day2=input.next();
		   System.out.println("Please enter day 3 of the week");
		   String day3=input.next();
		   System.out.println("Please enter day 4 of the week");
		   String day4=input.next();
		   System.out.println("Please enter day 5 of the week");
		   String day5=input.next();
		   System.out.println("Please enter day 6 of the week");
		   String day6=input.next();
		   System.out.println("Please enter day 7 of the week");
		   String day7=input.next();
   array[0]=day1;
   array[1]=day2;
   array[2]=day3;
   array[3]=day4;
   array[4]=day5;
   array[5]=day6;
   array[6]=day7;
   for (int i=0;i<array.length;i++){
     System.out.println(array[i]);
   }
*/
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!WITH  SCANNER!!!!!!!!!!!!!!!!!!!!!
		Scanner input=new Scanner(System.in);
		   String[]weekdays=new String[7];
		      for(int i=0;i<7;i++){
		     System.out.println("Please enter day "+(i+1)+" of the week");
		     weekdays[i]=input.next();
		   }
		   input.close();
		   for(int i=0;i<7;i++){
		     System.out.println(weekdays[i]);
		   }
		   input.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

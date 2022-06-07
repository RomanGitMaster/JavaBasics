package com.syntax.class05;

import java.util.Scanner;

public class HM4 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
      System.out.println("Please enter your time in 24h format:");
      int t=input.nextInt();
      if (t>=1&&t<=11) {
      System.out.println("It is Morning");
      }else if (t>=12&&t<=15) {
    	  System.out.println("It is Afternoon");
      }else if (t>=16&&t<=20) {
    	  System.out.println("It is Evening");
      }else if (t>=21&&t<=24) {
    	  System.out.println("It is Night");
      }else {
    	  System.out.println("Invalid!Check your entry");
      }
      input.close();
	}

}
// do the program for more specific time
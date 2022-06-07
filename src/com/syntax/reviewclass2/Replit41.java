package com.syntax.reviewclass2;

import java.util.Scanner;

public class Replit41 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		  System.out.println("Enter the age of the Child");
		int age=input.nextInt();
		String scenario;
		switch(age){
		  case 1:
		    scenario="You can Crawl";
		    break;
		  case 2:
		    scenario="You can Talk";
		    break;
		  case 3:
		    scenario="You can Dance";
		    break;
		  case 4:
		    scenario="You can get Trouble";
		    break;
		  default:
		    scenario="I don't know how old you are";
		      }
		System.out.println(scenario);
		input.close();
	}

}

package com.syntax.class06;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * lets ask a user where is he from
		 * bbased on the country we will define favorite food
		 * 
		 */
		Scanner input=new Scanner(System.in);
		String country, favoriteFood;
		System.out.println("Where are you from?");
		country=input.nextLine();// since we declared String country we dont have to state it as String again
		
		//.equalsIgnoreCase wont work
		//instead .toLowerCase and String name
		switch (country.toLowerCase()) {
		case "Mexico":
			favoriteFood="tacos";
			break;
		case "Canada":
			favoriteFood="putine";
			break;
		case "Turkey":
			favoriteFood="lahmacun";
			break;
		case "Pakistan":
			favoriteFood="pati chai";
			break;
		case "Egypt":
			favoriteFood="koshary";
			break;
		case "USA":
			favoriteFood="burgers";
			break;
			default:
				favoriteFood="unknown";
			
		
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
		input.close();
		}
		
	}



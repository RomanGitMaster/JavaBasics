package com.syntax.class12;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Mom's first name? ");
		String momsName = scan.next();
		System.out.print("Dad's first name? ");
		String dadsName = scan.next();
		System.out.print("Are you expecting Boy or Girl? ");
		String kidsGender = scan.next();
		if (kidsGender.equalsIgnoreCase("boy")) {
			String boyName=dadsName.substring(0, dadsName.length()/2)+momsName.substring(0, momsName.length()/2);
			System.out.println("Suggested baby name: "+boyName.toUpperCase());
		} else if (kidsGender.equalsIgnoreCase("girl")) {
			String girlName=momsName.substring(0,momsName.length()/2)+dadsName.substring(0,dadsName.length()/2);
			System.out.println("Suggested baby name: "+girlName.toUpperCase()) ;
		} else {
			System.out.println("Oh, you dont know yet. Well, you still have time.");
		}
		scan.close();
		
		
		
	}

}

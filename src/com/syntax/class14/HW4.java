package com.syntax.class14;

import java.util.Scanner;

public class HW4 {
	String country;
	
	String greeting() {
		switch(country) {
		case "USA":
			return "Hi";
		case "Ukraine" :
			return "Привіт";
		case "Poland":
			return "Witam";
		case "Spain":
			return "Hola";
		case "Germany":
			return "Hallo";
		case "Japan":
			return "Kon'nichiwa";
		default :
		return "hey";
		}
		
	}
	public static void main(String[] args) {
		//# 4 Create a method that will say Hello in different language based on the country that will passed when method is executed
HW4 md=new HW4();
Scanner scan=new Scanner(System.in);
md.country=scan.next();
String greeting=md.greeting();
System.out.println("People from "+md.country+" say "+greeting);
scan.close();
	}

}

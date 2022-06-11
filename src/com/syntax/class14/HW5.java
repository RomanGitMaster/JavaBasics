package com.syntax.class14;

import java.util.Scanner;

public class HW5 {
String name;
String lastName;
String emailType;

void createEmail() {
	System.out.println("Email suggestion :"+name+lastName+"@"+emailType+".com");
}
	public static void main(String[] args) {
//#5 Create a method createEmail(). Based on values of users name, lastName and email type,
// your method should return complete email Address. Example: createEmail(John,
// Snow, gmail) ---> johnsnow@gmail.com or

		
		HW5 md=new HW5();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your first name:");
		md.name=scan.next();
		System.out.println("Please enter your last name:");
		md.lastName=scan.next();
		System.out.println("Please enter your email type:");
		md.emailType=scan.next();
		
		md.createEmail();
		scan.close();
	}

}

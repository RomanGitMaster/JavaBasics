package com.syntax.class14;

import java.util.Scanner;

public class Student {
	String name;
	int score;
	
	char getGrade() {
		if (score>=90) {
			return 'A';
		}else if (score>=80&&score<90) {
			return 'B';
		}else if (score>=70&&score<80) {
			return 'C';
		}else if (score>=50&&score<70) {
			return 'D';
		}else {}
		return 'F';
			
		
	}

	public static void main(String[] args) {
//#7 Create  class Student that will have a method getGrade. 
//Your method should accept the score of a student and return a grade:
/*score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F	
 */
		Student md=new Student();
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter student's name:");
		md.name=scan.nextLine();
		System.out.print("Please enter student's score:");
		md.score=scan.nextInt();
		char getGrade=md.getGrade();
		System.out.println("Student "+md.name+" grade is "+getGrade);
		scan.close();
		
		
	}

}

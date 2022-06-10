package com.syntax.reviewclass6;

public class Student {
	// define attributes/fields/parameters/variables
	String name, lastName, address;
	int studentId, age;
	char grade;

	// define behavior==methods in Java (inside a method we can create new method
	// 1 Methods in Java - used to describe behavior
	// 2 Inside we put logic to achieve particular task
	// 3 Must part of a method :
	// returnType name (){code of logic/block of code}
	// Methods can have return type or have void
	// Methods can have parameters or do not have them

//#1 create a method that will return full name in upper case
	String getFullName() {
		return name.toUpperCase() + " " + lastName.toUpperCase();
	}

	//#2create a method to display full info of a student

	void printInfo() {
		System.out.println(name + " " + lastName + " " + studentId + " is " + age + " old " + "lives in " + address);
	}

	//#3create a method that will return if student great, good , average or
	// bad based on a grade

	String rating() {
		switch (grade) {// <--- with return we don't need break or continue as "return" is end of the
						// code
		case 'A':
			return "great";

		case 'B':
			return "good";

		case 'c':
			return "average";

		default:
			return "bad";
		}

	}
	// if we want to add parameters // so we adding variable to avoid hardcoding
	void takesSubject(String subject) {
		System.out.println(name+" studies "+subject);
	}
	
	
	
	
	

	void studying() {
		System.out.println(name + " student is studying");
	}

	void doHomework() {
		System.out.println(name + " student is doing homework");
	}

	public static void main(String[] args) {

	}

}

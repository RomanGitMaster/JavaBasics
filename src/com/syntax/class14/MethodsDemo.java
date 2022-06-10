package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
// What is the Method? Method is a block of code a group of java statement that are grouped together and we can execute those statements
// by just crreating an object of the class that contains that method and by writing the object name.method name	
//3 main question we should always ask ourself: what is it? why we should use it? How to create it?	

	void printHello() {
		System.out.println("How are you guys");

	}
	boolean returnTrue() {
		return true;
		
	}
		int returnInt() {
			return 10;
			
		}
	public static void main(String[] args) {

// first we creating object of the class then we call object of the class
//Methods that return and Methods that don't return something
		
		MethodsDemo md = new MethodsDemo();
		md.printHello();
		
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());
		Scanner scan = new Scanner(System.in);
		scan.next();

	}

}

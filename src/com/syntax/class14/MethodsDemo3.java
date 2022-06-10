package com.syntax.class14;

public class MethodsDemo3 {

	boolean even(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean str(String word) {
		if (word.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// write a method that takes int value if that value is even this method returns
		// TRUE otherwise its FALSE
		// write a method that takes String and returns true if number of charecters in
		// that string are even otherwise odd

		MethodsDemo3 md = new MethodsDemo3();
		System.out.println(md.even(3));
		System.out.println(md.str("Durarara"));

	}

}

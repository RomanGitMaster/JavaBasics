package com.syntax.class12;

public class HW1 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.roman=>m
		String str = "roman";
		int middle = 0;
		if (!str.isEmpty()) {
				if (str.length()% 2 ==1 && str.length() >= 3) {
					middle= (str.length()-1)/2;

					System.out.println(str.charAt(middle));
				}else {
					System.out.println("amount of charecters is even");
				}

			}else {
				System.out.println("Its empty");
			}

		}
	}


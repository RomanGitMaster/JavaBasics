package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		// compiler is only looking for syntax error, logical errors are not being
		// checked( thats for debugging)

		int num1 = 200;
		int num2 = 200;
		int num3 = 20;
		int largest = 0;

		if (num1 >= num2 && num1 > num3) {
			largest = num1;
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		} else if (num2 >= num1 && num2 > num3) {
			largest = num2;
		} else {
			System.out.println("All numbers are equal");
		}
		if (largest != 0) {
			System.out.println("The largest number is " + largest);
		}

// finish it that largest would be 200

	}

}

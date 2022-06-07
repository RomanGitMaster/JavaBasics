package com.syntax.class08;

public class Repl57 {

	public static void main(String[] args) {
		// Create a for loop that prints out odd numbers from 5 to 22

        //Must not include the number 22 in the output
		
		//Output:5,7,9,11,13,15,17,19,21;
		
		for(int i=5;i<22;i+=2) {
			System.out.println(i);
		}
		
		//or
		
		for(int i2=5;i2<22;i2++) {
		if (i2%2!=0) {
			System.out.println(i2);
		}
		}
		
	}

}

package com.syntax.reviewclass2;
import java.util.Scanner;
public class Replit36 {

	public static void main(String[] args) {
	/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
	 * and make the comparisons:
	 * if int1 and int2 are equal and word1 and word2 are equal, output "AND"
	 * if int1 and int2 are equal or word1 and word2 are equal, output "OR"
	 * if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
	 * 
	 * **Example input/output:**
        word1: banana
        word2: banana
        int1: 2
        int2: 2
        Output: AND
	 * 
	 *  Output: OR

        word1: phone
        word2: pie
        int1: 2
        int2: 3
        Output: NONE
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String w1=input.next();
		String w2=input.next();
		System.out.println("Please enter two numbers");
		int n1=input.nextInt();
		int n2=input.nextInt();
		String output;
		if (n1==n2 && w1.equalsIgnoreCase(w2)) {
			output="AND";
		}else if (n1==n2 || w1.equalsIgnoreCase(w2)) {
			output="OR";
		}else {
			output="NONE";
		}
		System.out.println(output);
		
		input.close();
	}
	

}

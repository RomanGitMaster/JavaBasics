package com.syntax.class07;
import java.util.Scanner;
public class LoopsWithScanner {

	public static void main(String[] args) {
		
		
		/*We are going to ask if you got a job  
		 * 
		 * we will continuously will be asking until you say yes
		 * 
		 * once you say yes-----> congratulation!
		 * 
		 */
		
		
		Scanner input=new Scanner(System.in);
		String answer;
		do {
			System.out.println("Did you get a job?");
			answer=input.next();
			
		}while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Congrats!");
	    input.close();
		
		
		
		
	}

}

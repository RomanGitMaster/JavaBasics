package com.syntax.class08;
import java.util.Scanner;
public class ContinueKeyWord {

	public static void main(String[] args) {
		// continue -skips current execution/iteration
		//when java executes continue->
		//goes back to beginning of the loop,
		
		
		for (int i=1;i<=5; i ++) {
			if(i==2) {
				
			continue;// ignores rest of the code and continues 
			}
			System.out.println(i+" ");
		}
		
		// print numbers fromj 1 to 10 except 5 and 7
		
		for(int i=1;i<=10;i++) {
			if (i==5||i==7) {
			continue;
			}System.out.print(i+" ");
		}
		
		// print numbers from 1 to 50 except those thta are divisible by 3
		
		for (int i=1;i<=50;i++) {
			if(i%3==0) {
				continue;
			}System.out.println(i+" ");
		}
		
		
		
		Scanner input=new Scanner(System.in);
		String answer="";
		do {
			System.out.println("Apply for credit card");
			answer=input.next();
			
		}while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Congrats with new credit card!");
		input.close();
		
			}

}

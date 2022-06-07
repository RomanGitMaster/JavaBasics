package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*What is LogOper?    &&,||,!
		 * Why- when we need To test two or more conditions in 1 statement(block)
		 */
		/*
			
		 * LOGICAL OPERATORS:
		 * To test one or more conditions in 1 statement(block)
		 * AND-> && (to test one or more conditions in 1 statement(block))
		 * true&&true-->TRUE ( we go inside the block of condition(code)
		 * true&&false-->FALSE ( we do not go inside the block of condition(code)
		 * false&&true-->FALSE ( we do not go inside the block of condition(code)
		 * false&&false-->FALSE ( we do not go inside the block of condition(code)
		 * OR-> || 
		 * 
		 */
		
		//AND
		
		boolean job=true;
		double salary=100000;
		
		if (job&&salary>=100000) {
			System.out.println("I am super happy");
		}
				
		System.out.println("---------------------------");
				
		
		boolean study=true;
		boolean homework=true;
		boolean practice=false;// if one false it follows the logic and all is "false" and dont let you enter condition( block of statement)
		                       // and send you to "else block"
		if(study && homework && practice) {
			System.out.println("You will succed in the course");
		}else {
			System.out.println("You will strugle");
		}
		
		System.out.println("-----------------------------");
		
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if (num1>num2 && num1>num3){// <-False+True=False  
			System.out.println("The largest number is "+num1);
		}else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is "+num3);
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}
		

		
		
		
		
		
		
		
	}

}

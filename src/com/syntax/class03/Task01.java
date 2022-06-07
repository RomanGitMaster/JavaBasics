package com.syntax.class03;

public class Task01 {

	public static void main(String[] args) {
		
		
		/*Task
		 * Declare variable and increase it’s value by 500 and then by 200 using shorthand operator
		 * Declare variable and decrease it’s value by 60 using shorthand operator
		 * Declare variable cakePiece=11 and divide the value of that variable between 4 people using shorthand operator
		 * Declare variable cake=25 and divide cake between 7 people . Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		 */
		 	
		
		int a=250;
		a+=250;
		System.out.println(a);
		a+=200;
		System.out.println(a);
		
		int b=100;
		b-=60;
		System.out.println(b);
		
		int cakepiece=11;
		cakepiece/=4;
		
		System.out.println(cakepiece);
		
		int cake=25;
		cake/=7;
		 System.out.println(cake);
		
		 cake=25;
		 cake%=7;
		 System.out.println(cake);
	}

}

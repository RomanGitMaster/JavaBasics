package com.syntax.class04;

public class LarysasLargestNumberTask {

	public static void main(String[] args) {
		int num1=15;
		int num2=48;
		int num3=18;
		int seekenOne;
		
		if (num1>num2) {
			if(num1>num3) {
				seekenOne=num1;
			}
			else {
				if(num2>num3) {
					seekenOne=num2;
					
				}else {
					seekenOne=num3;
				}
			}System.out.println("The largest number is "+seekenOne);
		}
	}
}


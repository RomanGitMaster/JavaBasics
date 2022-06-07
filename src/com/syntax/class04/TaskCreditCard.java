package com.syntax.class04;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
      boolean yN=input.nextBoolean();
      if (yN==true) {
    	  System.out.println("What is the balance?");
    	  int balance=input.nextInt();
    	  if (balance>=1000) {
    		  System.out.println("Pay it off please");
    	  }else {
    		  System.out.println("You can spend more");
    	  }
      }else {
    	  System.out.println("Would you like to get a credit card?");
      }
      input.close();
	}

}

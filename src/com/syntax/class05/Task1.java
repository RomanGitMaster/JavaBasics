package com.syntax.class05;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
            System.out.println("Please state your height in inches:");
            int h=input.nextInt();
          if (h<=60) {
        	  System.out.println("you are short");
          }else if (h>=72) {
        	  System.out.println("YOU ARE TALLLLLLLL!!!");
          }else {
        	  System.out.println("you are medium");
          }

          input.close();
	}

}

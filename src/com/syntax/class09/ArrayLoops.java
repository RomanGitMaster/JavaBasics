package com.syntax.class09;

public class ArrayLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}

		String[] w = { "Java", "Is", "Saturday", "Day", };
		for (int a = 0; a < w.length; a++) {
			System.out.print(w[a] + " ");
		}
		System.out.println("---------------------");
		/*
		 * For each/Advanced for loop/ Enhanced for loop
		 * 
		 * CAN ONLY BE USED WHEN WORK WITH ARRAY or COLLECTIONS
		 * 
		 * 
		 */

		String[] colors = { "pink", "blue", "white", "black" };
		for (String color : colors) {
			System.out.println(color + " ");
		}

		int[] numbers = { 10, 20, 30, 40 };
		for (int number : numbers) {
			System.out.println(number + " ");
		}
		System.out.println(("*************************************************"));
//Create an array of cars and store 6 elements into it.Using 2 different loops print all values from the array. 
		String[] cars = new String[6];
		cars[0] = "Ford";
		cars[1] = "Chevrolet";
		cars[2] = "BMW";
		cars[3] = "Mercedes";
		cars[4] = "Toyota";
		cars[5] = "Tesla";
		int x = 0;
		while (x < cars.length) {
			System.out.println(cars[x] + " ");
			x++;
		}

		System.out.println("****************************************************");
		String[] carros = { "Ford", "Chevrolet", "BMW", "Mercedes", "Toyota", "Tesla" };
		for (String carro : carros) {
			System.out.println(carro + " ");
		}
		System.out.println("****************************************************");
		
		
		
		
		
		//Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array
		String[] animals = new String[5];
		animals[0] = "Tiger";
		animals[1] = "Lion";
		animals[2] = "Wolf";
		animals[3] = "Panter";
		animals[4] = "Jaguar";
        int n=0;
        while(n<animals.length) {
        	System.out.println(animals[n]);
        	n++;
        }
		System.out.println("*****************************************************");
		
		String[] animal = { "Tiger", "Lion", "Wolf", "Panter", "Jaguar" };
		for (String predators : animal) {
			System.out.println(predators + " ");
		}

	}

}

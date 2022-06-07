package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// Nested loop - is a loop inside another loop

		for (int i = 1; i <= 3; i++) {// outter loop (main condition)
			System.out.println("Hello");// will stop when "i" wont meet condition

			for (int y = 1; y <= 2; y++) {// nested loop(sub condition)
				System.out.println("Bye"); // until "y" will meet condition java will stay in inner loop, and only after
											// jumps to outter loop
			}
		}
// more examples how nested loop works within loop
		for (int i = 1; i <= 3; i++) {// outter loop controls and resets inner loop every time value for inner loop is changing
			System.out.println(i);
			for (int y = 1; y <= 2; y++) {
				System.out.println(y);
			}
		}

		//OMG !!!!
		for (int i = 1; i <= 3; i++) { 
			System.out.println(i);
			for (int y = 1; y <= 2; y++) {
				System.out.println(i+" "+y);
			}
		}
		
	}

}

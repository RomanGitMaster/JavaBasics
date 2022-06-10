package com.syntax.class14;

public class MethodsDemo2 {

	// write a method that wehn called it should print 5 times Batch 13 is great

	void print() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Batch 13 is great");
		}
	}
	// we can data type and use it 
	void printManyTimes(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Day is great");
		}
	}


	public static void main(String[] args) {

		MethodsDemo2 md = new MethodsDemo2();//<--- creating object of a class
		md.print();
		md.printManyTimes(3);// we specified int times above in (void) method and added value here 
	}

}

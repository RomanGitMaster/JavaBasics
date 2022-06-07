package com.syntax.reviewclass5;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i);
			}
		}
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		// continue and break

		for (int a = 0; a < 5; a++) {
			System.out.println("Batch13 is great");
			if (a > 2) {
				continue;
			}
			System.out.println("Batch13 is excelent");
		}
System.out.println("***********************");
		// with no continue

		for (int p = 0; p < 5; p++) {
			System.out.println("Batch 13 is great");
			if (p <= 2) {
				System.out.println("Btach 13 is excelent");
			}
		}
		
		System.out.println("--------------");
		
		for (int s=0;s<5;s++) {
			if(s<2) {
				break;
			}
			System.out.println("Zameer the Break manager");
		}System.out.println("we are done looping");
		
		//or
		System.out.println("****************************");
		for(int y=0;y<3;y++) {
			System.out.println("Batch13 is great");
		}
		
		System.out.println("we are done looping");
	}
}

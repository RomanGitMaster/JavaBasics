package com.syntax.class07;

public class WhileLoopsExamples {

	public static void main(String[] args) {

		// print numbers from 1 to 10

		int num = 1;

		while (num <= 10) {

			System.out.print(num + " ");
			num++;
		}

		// print numbers from 10 to 100

		int x = 10;
		while (x <= 100) {
			System.out.print(x + " ");
			x++;
		}

		int b = 10;
		while (b >= 1) {
			System.out.println(b + " ");
			b--;
		}

		// from 100 to 150

		int y = 100;
		while (y <= 150) {
			System.out.println(y + " ");
			y++;
		}
		// from -1 to -10

		int s = -1;
		while (s >= -10) {
			System.out.println(s + " ");
			s--;

		}
		// print 1 to 20 only even numbers

		int r = 1;
		while (r <= 20) {
			r += 1;
			System.out.println(r + " ");
			r++;
		}
		// or
System.out.println("----------------------------------------------------");
		int t = 2;
		while (t <= 20) {
			if (t % 2 == 0) {
				System.out.println(t + " ");
				t++;
			}

			
		}
		
		
		//print only odd numbers from 100 to 1
		
		int o=100;
		while (o>=1) {
			if (o%2!=0)
			System.out.println(o+" ");
		}o--;
		

	}

}

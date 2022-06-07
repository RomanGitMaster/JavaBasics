package com.syntax.class10;

public class Replit67b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int g = 1; g <= 5; g++) {
			for (int h = 2; h <= 50; g++) {
				if (g == 1 && h == 2) {
					if (h == 10) {
						break;
					}
				}else if (g == 2 && h == 20) {
					h += 1;
					if (h == 20) {
						break;
					}
				}else if (g == 3 && h == 30) {
					h += 2;
					if (h == 20) {
						break;
					}
				}else if (g == 4 && h == 40) {
					h += 3;
					if (h == 40) {
						break;
					}
				}else if (g == 5 && h == 50) {
					h += 4;
					if (h == 50) {
						break;
					}
				}System.out.print(g+" "+h+" ");
			}
		}System.out.println(" ");
	}

}

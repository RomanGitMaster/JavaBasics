package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		// Without braces Java identifies only one statment per block( if to remoe braces"{}" in IF&ELSE block

		String time = "Mornig";
		if (time.equals("Morning")) {
			System.out.println("Say Good Morning");
		} else {
			System.out.println("Say Good Day");

		}
		System.out.println("Make sure to use {} braces for If Statment");
	}

}

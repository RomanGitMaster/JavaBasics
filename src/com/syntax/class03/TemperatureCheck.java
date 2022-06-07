package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		int t;
		t = 30;
		if (t < 32) {
			System.out.println("Water will freeze with temperature " + t);
		} else {
			System.out.println("Water will not freeze with temperature" + t);
		}
	}

}

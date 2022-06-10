package com.syntax.class13;

public class HM6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
   String day1="Today is Wedndesday";
   String day2="Tomorrow is Thursday";
   System.out.println(day1.replace(day1,day2));
   System.out.println(day2.replace(day2,day1));
	}

}

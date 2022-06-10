package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=" Bo b";

System.out.println(str.startsWith("Forzen"));

System.out.println(str.endsWith("t"));

System.out.println(str.endsWith("Great"));

System.out.println(str.endsWith("great"));//has to match in other case it will be false

System.out.println(str.toLowerCase().endsWith("great"));// to search if sentence ends with word "great" with lower case

System.out.println(str.contains("13"));

System.out.println(str.contains("is"));


System.out.println(str.toLowerCase().contains("13"));



str=str.toLowerCase().replace(" ","");
System.out.println(str);

System.out.println("_____________________________________________");

	}

}

package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Aladdin");// proper way to create an object from a class
		String name2 = "Aladdin";// its the same as one above

        // All the classes in java can be treated as data types
		// if class is present inside the same package or if class belongs to java.lan package
        System.out.println(name.length());
        
        System.out.println(name.toLowerCase());
        System.out.println((name2.toUpperCase()));
	}

}

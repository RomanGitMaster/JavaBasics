package com.syntax.class12;

public class StringDemo2 {
	public static void main(String[] args) {
		String firstName = "Adam";
		String lastName = " Jones";
		String fullname = firstName + lastName;//always a;ways prefer this
		String fullName=firstName.concat(lastName);// never use this because it can lead you to nullpointer error
		System.out.println(fullname);
		
		String name=" ";
		System.out.println(name.isEmpty());//tell if true or not if empty or not
		
		String str=" never ";
		System.out.println(str.trim());// eliminates spaces only spaces around the word
	}
}
package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sameer is funny Sameer is gulbadan and he is sheer badan";
		//System.out.println(str.charAt(2));
		//System.out.println(str.charAt(6));

		
		// write a program to print the name by charAT();
		/*for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
				}
		*/
		// to count how "s" in String str( we can letter a )
		int counter=0;
		
		for (int i=0;i<str.length();i++) {
			if('s'==str.charAt(i)||'S'==str.charAt(i)||'a'==str.charAt(i)||'A'==str.charAt(i)) {
				counter++;
			}
		}
			System.out.println("s adn a appeared "+ counter+ " in the string");
		
			
			
		
	}

}
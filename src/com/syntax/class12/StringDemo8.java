package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		//METHODS OF STRING JAVA
		String str="Java is Easya";
		String str2=str.substring(0,4);
		System.out.println(str2);
		System.out.println(str.substring(8,12));
		
		
		
		
		
		//replace(), replaceAll(), replaceFirst()<------for all of the the word ,letter -they have to be exact as in original string (with upper or lower cases)
		
	 
		
		System.out.println("_______________________________");
		String  str1="Learn  programming Yourself Learn";
		
		String str3=str1 .replace("pro","bro");//<-- .replace();-replaces symbol(s), number(s), letter(s) (we can use ->'a') , word, sentence or sequence of them we specify
		System.out.println(str3);                // we can even delete or add space old selected (symbol, letter, word, sentence) by choosing ->""or "      " accordingly 
		                                         // we also can replace empty spaces with new letter, symbol, char, word->Learn!!programming!Yourself!Learn
		                                         // we also can replace ""(no spaces) with new letter, symbol, char, word->!L!e!a!r!n! ! !p!r!o!g!r!a!m!m!i!n!g! !Y!o!u!r!s!e!l!f! !L!e!a!r!n!
		String str4=str1.replaceFirst("a","i"); //<-----.replaceFirst(); replaces ONLY FISRT character in a string (even if there are more same char) and we should us ->" " to select which one , NOT ->'' 
		System.out.println(str4);
		
		String str5=str1.replaceAll("Learn","Go");//<----.replaceAll(); replaces all sequence of same letters, symbols, words...using only " " to specify
		System.out.println(str5);
		
		String str6=str5.replaceAll(str5, str3);//<--- if we want totswitch strings we need to select string being replaced and and specify again first and then new (other way it will just print selcted 
		System.out.println(str6);               // string with no changes
		
		
		String str9="1247823aedgHD4194-2#FCSG$@*($&)_";
		System.out.println(str9.replaceAll("[0-9]","#"));
		System.out.println(str9.replaceAll("[A-Z]","#"));
		System.out.println(str9.replaceAll("[A-Za-z]","#"));
		System.out.println(str9.replaceAll("[A-Za-z0-9]","#"));
		System.out.println(str9.replaceAll("[A-Za-z]","#"));
		System.out.println(str9.replaceAll("[^A-Za-z]","*"));//<----repleces only symbols and skips everything else
		System.out.println(str9.replaceAll("[^A-za-z0-9]",""));//<---^serves as "NOT" 
		//CHECK ascii table for more info
		//if to specify from A-z means it include all upper case to lower cases from A to z
		//TO LEARN MORE ABOUT IT CHECK regexr.com
	}

}





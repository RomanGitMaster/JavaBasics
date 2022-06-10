package com.syntax.class13;

public class HW5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
		String word="Mad A m";
		word=word.toLowerCase().replace(" ", "");
		String reverse="";
		for (int i=word.length()-1;i>=0;i--) {
			reverse+=word.charAt(i);
		}
		boolean palindrome=true;
        for (int i=0;i<word.length();i++) {
        	if(reverse.charAt(i)!=word.charAt(i)) {
        		palindrome=false;
        	}
        }
        System.out.println(palindrome);
	}

}

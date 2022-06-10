package com.syntax.class13;

public class HW4 {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		String sentence="This is sentence i want to reverse";
		String[] words=sentence.split(" ");
		
		String revSentence="";
		 for(String word:words) {
			 String rev="";
			 for(int i=word.length()-1;i>=0;i--) {
				 rev+=word.charAt(i);
			 }
			 revSentence+=rev+" ";
			 
		 }System.out.println(revSentence);
		
		
	}
}
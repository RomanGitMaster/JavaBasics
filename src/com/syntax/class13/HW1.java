package com.syntax.class13;

public class HW1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
String wednesday="Another day of Java.";
String everyday=wednesday.replace(" ","");
System.out.println(everyday);

       //Create a String that should be combination of letters, numbers and special characters. 
       //Find out how many Alphanumeric characters are there in the String.
String str="Bababhalamaha12@23#4&5";//

System.out.println(str.replaceAll("^A-Za-z0-9]","").length());

        //You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” 
        //How would you find out how many sentences are in that String?
  String a="Is it saturday? Is it raining? Do we have a Java Class today?";
  System.out.println(a.split("[?]").length); // <----with a split method
  /*String n="";
  for (int i=0;i<a.length();i++) {
	  if(a.charAt(i)=='.'||a.charAt(i)=='!'||a.charAt(i)=='?') {
		  n+=a.charAt(i);
	  }
  }
  System.out.println("The are "+n.length()+" sentences.");
  
  
  */
	}

}

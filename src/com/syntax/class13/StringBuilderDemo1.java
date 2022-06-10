package com.syntax.class13;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("This is sentence i want to reverse");
		str.reverse();
		
String s=new String("hahahahaha"); 
System.out.println(s.toUpperCase());
StringBuilder st=new StringBuilder("jajajajajja");
System.out.println(st.reverse());

//all these are classes that we can use to store and manipulate charecters
//- but String immutable(cant be changed) AND StringBuilder is mutable( can be changed)
// when we make a lot of changes to a every change a new variable is created
}
}
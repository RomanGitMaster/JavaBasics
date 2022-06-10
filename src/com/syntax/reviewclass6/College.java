package com.syntax.reviewclass6;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student st=new Student();
   
   st.name="John";
   st.lastName="Doe";
   st.address="New York";
   st.studentId=199;
   st.age=45;
   st.grade='B';
   //accessing methods 
   st.studying();
   st.doHomework();
   
   System.out.println(st.getFullName());
   //below 2 methods have return Type -String
   st.printInfo();
   String rating=st.rating();// <--- think about Scanner we use
   System.out.println(st.name+" is "+rating+" student");
   
   
	}

}

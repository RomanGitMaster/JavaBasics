package com.syntax.reviewclass6;

public class School {

	public static void main(String[] args) {
		Student student1=new Student();
student1.name="Samira";
student1.lastName="Pashayeva";
student1.address="VA";
student1.studentId=101;
student1.age=25;
student1.grade='A';
student1.studying();
student1.doHomework();

System.out.println("_______________________________");
/*subject  cannot be resolved - no such variable
 * subject is not declared
student1.subject="Java";
*/
Student student2=new Student();

student2.name="Omid";
student2.lastName="Mahmoodi";
student2.address="CA";
student2.studentId=102;
student2.age=18;
student2.grade='A';
student2.studying();
student2.doHomework();

String fullName=student1.getFullName();//<----for return method we create same data type variable to store it and then rpint out
System.out.println(fullName);

fullName=student2.getFullName();//for return method we create same data type variable to store it and then rpint out
System.out.println(fullName);

student1.printInfo();
student2.printInfo();

student1.takesSubject("Java");
student2.takesSubject("Biology"); 



	}

}

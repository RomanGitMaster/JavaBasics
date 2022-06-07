package com.syntax.reviewclass2;

public class StringConcat {

	public static void main(String[] args) {
		
		String firstName="Ali";
		String lastName="Baba";
		int num=10;
		int num2=10;
		//RULLES OF CONCATination:
		String fullName=firstName+lastName;
		System.out.println(fullName);
		System.out.println(firstName+num+num2);//1st operation=firstName+num=>Ali10+10=Ali1010
		System.out.println(firstName+(num+num2));//1st operation=(num+num2)=10+10=>Ali+20
		System.out.println(num+firstName+num2);//1st operation=10Ali+10=>10Ali10
		
	}

}

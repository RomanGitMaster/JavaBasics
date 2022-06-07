package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "kat";
		String name2 = "kat";
		System.out.println(name.equals(name2));
		name2 = "KAT";
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println("_____________________________");

		String userName = "admin";   //add scanner and loops
		String password = "pas000000";
		String confirmPassword = "pas000000";
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("USername and Password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");

		} else if (password.contains("admin")) {
			System.out.println("Pasword cannot contain username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match ");
		}

		else  {
			System.out.println("Your username and password has been created");
		}
	}

}

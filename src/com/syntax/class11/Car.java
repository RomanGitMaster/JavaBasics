package com.syntax.class11;

public class Car {

	String model;
	String make;
	String color;
	int year;
	int HP;
	
void MoveForward() {
	System.out.println("Car moves forward");
}
void reverse() {
	System.out.println("Car moves backwards");
}

public static void main( String[] args) {
	Car bmw=new Car();
	bmw.model="X6";
	bmw.make="BMW";
	bmw.color="Black";
	bmw.year=2022;
	bmw.HP=500;
	System.out.println(bmw.model);
	bmw.MoveForward();
	bmw.reverse();
	
	Car lexus=new Car();
	lexus.make="Lexus";
	lexus.model="LX570";
	lexus.color="white";
}
}

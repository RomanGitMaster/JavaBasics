package com.syntax.class11;

public class Dogs {
	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	// Labrador with specific attributes and behaviors
	String breed;
	String name;
	double weight;
	String color;
	int age;

	void plays() {
		System.out.println("Runs and jumps around like there is no tomorrow");
	}

	void snores() {
		System.out.println("Unconcius most of the day, snorrs a lot");
	}

	void follows() {
		System.out.println("Follows human");
	}

	void eats() {
		System.out.println("Consumes everything that smells good, moves or looks edible");
	}

	void poops() {
		System.out.println("Oh no, again O_o?!");
	}

public static void main(String[] args) {
	
Dogs Husky=new Dogs();
Husky.breed="Spitz";
Husky.name="Terror";
Husky.weight=25.50;
Husky.color="Black-White";
Husky.age=3;
System.out.println("Husky by name "+Husky.name);
Husky.eats();
Husky.plays();
Husky.poops();
System.out.println(" ");

Dogs Bulldog=new Dogs();
Bulldog.breed="Mastiff";
Bulldog.name="Salivan";
Bulldog.weight=20.87;
Bulldog.color="Brown-White";
Bulldog.age=5;
System.out.println("Bulldog by name "+Bulldog.name);
Bulldog.eats();
Bulldog.snores();
Bulldog.poops();
System.out.println(" ");

Dogs Labrador=new Dogs();
Labrador.breed="Retriever";
Labrador.name="Jack";
Labrador.weight=32;
Labrador.color="White";
Labrador.age=4;
System.out.println("Labrador by name "+Labrador.name);
Labrador.plays();
Labrador.follows();




}
}

package com.syntax.class11;

public class Dog {
// atributes how the object,  look like
	String name;
	int age;
	double weight;// atributes, properties of a class(in our case created class"DOG')
	String color;
	double height;
	String breed;
// behavior of the object
	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	public static void main(String[] args) {
		// First we write name of the class
		Dog jimmy=new Dog();// how we create an object
		
		//to open a class---> select ctr and open declaration
		
		
		//Defining atributes of an object, how does dog looks like
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.color="Pink";
		jimmy.height=2.6;
		jimmy.breed="German";
		
		jimmy.bark();
		
		
		
	}
}

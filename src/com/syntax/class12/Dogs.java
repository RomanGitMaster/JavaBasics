package com.syntax.class12;

public class Dogs {
	String name;
	  String breed;
	  String color;

	  void bark(){
	    System.out.println("can bark");
	    }
	  void run(){
	    System.out.println("can run");
	  }
	  void play(){
	    System.out.println("can play");
	  }
	public static void main(String[] args) {
Dogs h=new Dogs();
h.breed="Husky";
System.out.print(h.breed+" ");
h.bark();
System.out.print(h.breed+" ");
h.run();
System.out.print(h.breed+" ");
h.play();
Dogs b=new Dogs();
b.breed="Bulldog";
System.out.print(b.breed+" ");
b.bark();
System.out.print(b.breed+" ");
b.run();
System.out.print(b.breed+" ");
b.play();
Dogs l=new Dogs();
l.breed="Labrador";
System.out.print(l.breed+" ");
l.bark();
System.out.print(l.breed+" ");
l.run();
System.out.print(l.breed+" ");
l.play();



	}

}

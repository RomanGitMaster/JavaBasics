package com.syntax.class11;

public class Phone {
	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with
	// specific attributes and behaviors.
	String type;
	String manufacturer;
	String model;
	int camera;

	void calls() {
		System.out.println("Makes calls");
	}

	void connects() {
		System.out.println("Connects to internet");
	}

	void plays() {
		System.out.println("Plays music");
	}

	public static void main(String[] args) {

		Phone Iphone = new Phone();
		Iphone.type = "Smartphone";
		Iphone.manufacturer = "Apple";
		Iphone.model = "12Mini";
		Iphone.camera = 2;
		System.out.println("Iphone is a " + Iphone.type + " produced by " + Iphone.manufacturer);
		Iphone.calls();
		Iphone.connects();
		Iphone.plays();
		System.out.println(" ");
		Phone Pixel = new Phone();
		Pixel.type = "Smartphone";
		Pixel.manufacturer = "Google";
		Pixel.model = "5a";
		Pixel.camera = 2;
		System.out.println("Pixel is a " + Pixel.type + " poduced by " + Pixel.manufacturer);
		Pixel.calls();
		Pixel.connects();
		Pixel.plays();
		System.out.println(" ");
		Phone Samsung = new Phone();
		Samsung.type = "Smartphone";
		Samsung.manufacturer = "Samsung";
		Samsung.model = "Galaxy Z Flip 3";
		System.out.println(Samsung.model + "is " + Pixel.type + " produced by " + Samsung.manufacturer);
		Samsung.calls();
		Samsung.connects();
		Samsung.plays();

	}

}

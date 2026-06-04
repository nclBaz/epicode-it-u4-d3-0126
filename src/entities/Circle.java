package entities;

import java.util.Random;

public class Circle {

	// Lista Attributi STATICI
	public static int numCerchiCreati = 0;

	// Lista Attributi
	public int id;
	public double radius;
	public double x;
	public double y;

	// Lista Costruttori
	public Circle() { // I COSTRUTTORE - NO PARAMETRI
		// Utilizzo: Circle circle = new Circle();
		this.x = 100.0;
		this.y = 100.0;
		this.radius = 1.0;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
		Circle.numCerchiCreati++;
	}

	public Circle(double radius) { // II COSTRUTTORE - 1 PARAMETRO
		// Utilizzo: Circle circle = new Circle(10.3);
		this.radius = radius;
		this.x = 100.0;
		this.y = 100.0;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
		Circle.numCerchiCreati++;
	}

	public Circle(double radius, double x, double y) { // III COSTRUTTORE - 3 PARAMETRI
		// Utilizzo: Circle circle = new Circle(10.3, 2.6, 3.0);
		if (radius <= 0) this.radius = 1.0;
		else this.radius = radius;
		this.x = x;
		this.y = y;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
		Circle.numCerchiCreati++;
	}

	// Lista Metodi Statici
	public static void printNumeroCreati() {
		System.out.println("Numero cerchi creati: " + Circle.numCerchiCreati);
	}


	// Lista Metodi
	public double getDiameter() {
		return this.radius * 2;
	}

	public void printDiameter() {
		System.out.println("Il diametro è: " + this.getDiameter());
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public void printInfo() {
		System.out.println("Id: " + this.id);
		System.out.println("(X,Y): " + this.x + ", " + this.y);
		System.out.println("Raggio: " + this.radius);
		System.out.println("Diametro: " + this.getDiameter());
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimeter());
	}
}

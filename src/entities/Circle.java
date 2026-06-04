package entities;

public class Circle {

	// Lista Attributi
	public double radius;
	public double x;
	public double y;

	// Lista Metodi
	public double getDiameter() {
		return radius * 2;
	}

	public void printDiameter() {
		System.out.println("Il diametro è: " + getDiameter());
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public void printInfo() {
		System.out.println("(X,Y): " + x + ", " + y);
		System.out.println("Raggio: " + radius);
		System.out.println("Diametro: " + getDiameter());
		System.out.println("Area: " + getArea());
		System.out.println("Perimetro: " + getPerimeter());
	}
}

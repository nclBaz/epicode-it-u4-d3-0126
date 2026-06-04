import entities.Circle;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle(); // I COSTRUTTORE
		Circle circle2 = new Circle(10.3); // II COSTRUTTORE
		Circle circle3 = new Circle(10.3, 2.6, 3.0); // III COSTRUTTORE

		System.out.println("Cerchio 1");
		circle1.radius = 2;
		circle1.printInfo();
		System.out.println("Cerchio 2");
		circle2.printInfo();
		System.out.println("Cerchio 3");
		circle3.printInfo();
	}
}

import entities.Circle;

public class Main {
	public static void main(String[] args) {

		Circle.printNumeroCreati();

		Circle circle1 = new Circle(); // I COSTRUTTORE
		Circle circle2 = new Circle(10.3); // II COSTRUTTORE
		Circle circle3 = new Circle(10.3, 2.6, 3.0); // III COSTRUTTORE

		System.out.println("Cerchio 1");
		circle1.radius = 2;
		circle1.printInfo();
		System.out.println("Cerchio 2");
		circle2.printInfo();
		System.out.println("Cerchio 3");
		circle3 = null; // Gli oggetti possono essere NULL e pertanto accedere a attributi/metodi genererà una NullPointerException
		if (circle3 != null) // Quando ci sono dubbi meglio fare controlli
			circle3.printInfo();


		// ATTRIBUTI/METODI NON STATICI - Hanno bisogno di oggetti creati per essere utilizzati
		circle1.getDiameter(); // qua il this punta a circle1
		circle2.getDiameter(); // qua il this punta a circle2

		// ATTRIBUTI/METODI STATICI - NON hanno bisogno di oggetti creati per essere utilizzati

		Circle.printNumeroCreati();

	}
}

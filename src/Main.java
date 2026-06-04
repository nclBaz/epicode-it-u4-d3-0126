import entities.Circle;
import entities.User;

public class Main {
	public static void main(String[] args) {

		Circle.printNumeroCreati();

		Circle circle1 = new Circle(); // I COSTRUTTORE
		Circle circle2 = new Circle(10.3); // II COSTRUTTORE
		Circle circle3 = new Circle(10.3, 2.6, 3.0); // III COSTRUTTORE

		System.out.println("Cerchio 1");
		//circle1.radius = 2;
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


		// UGUAGLIANZA TRA OGGETTI
		Circle circle4 = new Circle();
		// Circle circle4 = circle1; <-- Avessi fatto così sarebbero stati uguali (stessa cella di memoria)
		circle1.id = 1;
		circle4.id = 1;

		if (circle1 == circle4) { // == Compara la celle di memoria, quindi sono due oggetti per lui diversi
			System.out.println("SONO UGUALI");
		} else {
			System.out.println("SONO DIVERSI");
		}

		if (circle1.equals(circle4)) { // Di default .equals() si comporta in maniera IDENTICA a ==
			// Allora solitamente si SOVRASCRIVE (OVVERRIDE) il metodo equals impostando dei criteri
			// personalizzati di comparazione ES: se hanno stesso id, stesso raggio, stessa x, stessa y allora sono uguali
			// In IntelliJ si può generare velocemente il metodo equals con tasto dx (nella classe) -> Generate -> equals and hashCode
			// (hashCode per ora non ci serve)
			System.out.println("SONO UGUALI");
		} else {
			System.out.println("SONO DIVERSI");
		}

		// STAMPA OGGETTI
		// Di default gli oggetti vengono stampati come nomepackage.nomeclasse@o1j3oi2j3oi
		// Se non mi va bene quel comportamento vado a fare l'OVERRIDE del metodo .toString()
		// In IntelliJ tasto dx -> Generate -> toString()

		System.out.println(circle1);
		System.out.println(circle2);

		User aldo = new User("123", "aldo@gmail.com");
		User giova = new User("asdfreqwe", "giova@gmail.com");
		System.out.println(aldo);
		System.out.println(giova);

		System.out.println(User.passwordValida(aldo.password));
		System.out.println(User.passwordValida("123"));

		User aldo2 = new User("123", "aldo@gmail.com");
		aldo.id = 1;
		aldo2.id = 1;

		if (aldo == aldo2) System.out.println("SONO UGUALI");
		else System.out.println("SONO DIVERSI");

		if (aldo.equals(aldo2)) System.out.println("SONO UGUALI");
		else System.out.println("SONO DIVERSI");


	}
}

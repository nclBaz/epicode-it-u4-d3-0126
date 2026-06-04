package entities;

import java.util.Objects;
import java.util.Random;

public class User {
	// Attributi statici
	public static final int MIN_LUNGH_PW = 4;

	// Attributi
	public int id;
	public String email;
	public String password;

	// Costruttori
	public User(String password, String email) {
		this.password = password;
		this.email = email;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
	}

	// Metodi di classe
	public static boolean passwordValida(String password) {
		if (password != null && password.length() >= MIN_LUNGH_PW) return true;
		else return false;
	}

	// Metodi di istanza
	public void inviaEmail(String testo) {
		System.out.println("Inviata email a " + this.email + ", con il seguente testo: " + testo);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id && Objects.equals(email, user.email) && Objects.equals(password, user.password);
	}
	
}

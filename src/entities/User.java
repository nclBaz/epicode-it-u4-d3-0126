package entities;

import java.util.Objects;
import java.util.Random;

public class User {
	// Attributi statici
	private static final int MIN_LUNGH_PW = 4;

	// Attributi
	private int id;
	private String email;
	private String password;
	private Role role; // Con l'ENUM Role andiamo a restringere i possibili valori per
	// l'attributo ai soli definiti nell'enum Role

	// Costruttori
	public User(String password, String email) {
		this.password = password;
		this.email = email;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
		this.role = Role.USER;
	}

	// Metodi di classe
	public static boolean passwordValida(String password) {
		if (password != null && password.length() >= MIN_LUNGH_PW) return true;
		else return false;
	}

	// GETTER & SETTER
	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

//	public String getPassword() { <-- La voglio tenere per uso interno e basta
	// quindi non faccio il getter
//		return password;
//	}

	public void setEmail(String email) {
		// TODO: validare l'email ricevuta
		if (!email.isEmpty())
			this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setPassword(String password) {
		if (password.length() > MIN_LUNGH_PW)
			this.password = password;
	}

	//	public void setId(int id) { // Una volta impostato non voglio che sia modificabile
	// quindi non faccio il setter
//		this.id = id;
//	}


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
				", role='" + role + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id && Objects.equals(email, user.email) && Objects.equals(password, user.password);
	}

}

package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String name, email;
	private LocalDate birthDate;
	
	public Cliente(String name,String email,LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.name = email;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " (");
		sb.append(birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") - ");
		sb.append(email);
		return sb.toString();
	}
	
}

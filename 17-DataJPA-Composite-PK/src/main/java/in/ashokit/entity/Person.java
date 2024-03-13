package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {

	private String name;

	private String email;

	private String gender;

	@EmbeddedId
	private PersonPK personPk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PersonPK getPersonPk() {
		return personPk;
	}

	public void setPersonPk(PersonPK personPk) {
		this.personPk = personPk;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", gender=" + gender + ", personPk=" + personPk + "]";
	}

}

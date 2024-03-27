package in.ashokit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message = "Name is mandatory")
	@Size(min = 3, max = 8, message = "Min 3 and Max 8 chars allowed")
	private String name;

	@NotEmpty(message = "Email is mandatory")
	@Email(message = "Enter valid email")
	private String email;

	@NotNull(message = "Phno is mandatory")
	private Long phno;

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

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

}

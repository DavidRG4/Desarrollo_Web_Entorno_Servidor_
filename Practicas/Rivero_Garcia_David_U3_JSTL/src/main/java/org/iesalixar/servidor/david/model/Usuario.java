package org.iesalixar.servidor.david.model;

public class Usuario {
	private String usuario;
	private String email;
	private String password;
	private String role;
	private String firstName;
	private String LastName;

	private Usuario(String usuario, String email, String password, String role, String firstName, String lastName) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		LastName = lastName;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}

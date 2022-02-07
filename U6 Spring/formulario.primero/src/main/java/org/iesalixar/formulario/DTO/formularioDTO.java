package org.iesalixar.formulario.DTO;

import java.util.ArrayList;
import java.util.List;

public class formularioDTO {
	private String firstName;
	private String lastName;
	private String DNI;
	private String grade;
	private List<String> asignents;

	public formularioDTO() {
		asignents = new ArrayList<>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public List<String> getAsignents() {
		return asignents;
	}

	public void setAsignents(List<String> asignents) {
		this.asignents = asignents;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}

package org.alixar.formulario2.DTO;

import java.util.ArrayList;
import java.util.List;

public class personasDTO {
	private List<String> grupo;
	private String vipon;
	private int personas;

	public personasDTO() {
		this.grupo = new ArrayList<>();
	}

	public List<String> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<String> grupo) {
		this.grupo = grupo;
	}

	public String getVipon() {
		return vipon;
	}

	public void setVipon(String vipon) {
		this.vipon = vipon;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

}

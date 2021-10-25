package org.iesalixar.servidor.david;

public class ReservaModdel {
	private String finicio;
	private String ffinal;
	private String personas;
	private String[] servicios;

	public ReservaModdel() {
		// TODO Auto-generated constructor stub
	}

	public String getFinicio() {
		return finicio;
	}

	public void setFinicio(String finicio) {
		this.finicio = finicio;
	}

	public String getFfinal() {
		return ffinal;
	}

	public void setFfinal(String ffinal) {
		this.ffinal = ffinal;
	}

	public String getPersonas() {
		return personas;
	}

	public void setPersonas(String personas) {
		this.personas = personas;
	}

	public String[] getServicios() {
		return servicios;
	}

	public void setServicios(String[] servicios) {
		this.servicios = servicios;
	}

}

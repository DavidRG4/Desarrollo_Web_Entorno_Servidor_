package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private int creditos;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private String curso;
	@Column(nullable = false)
	private String cuatrimestre;
	@Column(nullable = false)
	private Long id_profesor;
	@Column(nullable = false)
	private Long id_grado;

	public Asignatura() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(Long id_profesor) {
		this.id_profesor = id_profesor;
	}

	public Long getId_grado() {
		return id_grado;
	}

	public void setId_grado(Long id_grado) {
		this.id_grado = id_grado;
	}

}

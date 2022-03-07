package org.iesalixar.servidor.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
	private Integer curso;
	@Column(nullable = false)
	private Integer cuatrimestre;
	@ManyToOne
	@JoinColumn(name = "id_profesor")
	private Profesor profesor;
	@ManyToOne
	@JoinColumn(name = "id_grado")
	private Grado grado;
	@OneToMany(mappedBy="asignatura",cascade=CascadeType.ALL,orphanRemoval = true)
	private Set<AlumnoAsignatura> alumnosAsignatura = new HashSet<>();

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Integer getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(Integer cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}
}

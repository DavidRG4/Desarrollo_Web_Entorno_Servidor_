package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " alumno_se_matricula_asignatura")
public class Alumno_Se_Matricula_Asignatura {
	@Id
	private long id_alumno;
	@Column(nullable = false)
	private long id_asignatura;
	@Column(nullable = false)
	private Double nota;
	
	public Alumno_Se_Matricula_Asignatura() {
		// TODO Auto-generated constructor stub
	}

	public long getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(long id_alumno) {
		this.id_alumno = id_alumno;
	}

	public long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
}

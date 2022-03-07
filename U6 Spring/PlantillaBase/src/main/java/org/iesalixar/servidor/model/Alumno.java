package org.iesalixar.servidor.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false,length = 9,unique = true)
	private String nif;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido1;
	@Column(nullable= true)
	private String apellido2;
	@Column(nullable=false)
	private String ciudad;
	@Column(nullable=false)
	private String direccion;
	@Column(nullable=true)
	private String telefono;
	@Column(name="fecha_nacimiento",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	@Column(nullable=false, length = 1)
	private String sexo;
	@OneToMany(mappedBy="alumno",cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<AlumnoAsignatura> alumnoAsignaturas = new HashSet<>();
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Set<AlumnoAsignatura> getAlumnoAsignaturas() {
		return alumnoAsignaturas;
	}

	public void setAlumnoAsignaturas(Set<AlumnoAsignatura> alumnoAsignaturas) {
		this.alumnoAsignaturas = alumnoAsignaturas;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

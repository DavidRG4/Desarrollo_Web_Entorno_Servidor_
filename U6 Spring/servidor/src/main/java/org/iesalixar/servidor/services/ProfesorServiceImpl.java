package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.repository.AsignaturaRepository;
import org.iesalixar.servidor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements ProfesorService{
	@Autowired
	ProfesorRepository profrepost;

	@Override
	public List<Profesor> getAllProfesores() {	
	List< Profesor> profBD = profrepost.findAll(); 
		
		if (profBD!=null && profBD.size()>0) {
			return profBD;
		}
		return new ArrayList<Profesor>();
	}

	@Override
	public Profesor insertProfesores(Profesor profesor) {
		if (profesor!=null) {
			return profrepost.save(profesor);
		}
		return null;

	}

	@Override
	public Optional<Profesor> findProfesorById(Long id) {
		Optional<Profesor> profesor = null;
		
		if (id!=null) {
			profesor = profrepost.findById(id);
		}
		
		return profesor;
	}

}


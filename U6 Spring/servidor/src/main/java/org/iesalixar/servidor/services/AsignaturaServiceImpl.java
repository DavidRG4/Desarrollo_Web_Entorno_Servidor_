package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AsignaturaServiceImpl implements AsignaturaService {
	@Autowired
	AsignaturaRepository asigrepost;

	@Override
	public List<Asignatura> getAllAsignaturas() {
		List< Asignatura> asigBD = asigrepost.findAll(); 
		
		if (asigBD!=null && asigBD.size()>0) {
			return asigBD;
		}
		return new ArrayList<Asignatura>();
	}

	@Override
	public Optional<Asignatura> findAsignaturaById(Long id) {
		Optional<Asignatura> asignatura = null;
		
		if (id!=null) {
			asignatura = asigrepost.findById(id);
		}
		
		return asignatura;
	}

	@Override
	public Asignatura insertAsignatura(Asignatura asignatura) {
			if (asignatura!=null) {
				return asigrepost.save(asignatura);
			}
			return null;
		}

}

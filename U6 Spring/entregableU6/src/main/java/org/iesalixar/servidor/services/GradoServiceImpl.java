package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GradoServiceImpl implements GradoService {

	@Autowired
	GradoRepository gradoRepository;
	
	@Override
	public List<Grado> getAllGrados() {
		// Obtengo el resultado a través del repositorio
		List<Grado> gradDB = gradoRepository.findAll();

		// Verificando que he obtenido algo
		if (gradDB != null && gradDB.size() > 0) {

			return gradDB;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Grado>();

	}
	@Override
	public Grado insertGrado(Grado grado) {
		if (grado!=null) {
			return gradoRepository.save(grado);
		}
		return null;
	}

}

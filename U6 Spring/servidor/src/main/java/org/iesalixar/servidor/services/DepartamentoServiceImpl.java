package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Departamento;
import org.iesalixar.servidor.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
@Autowired
	DepartamentoRepository depresp;
	@Override
	public List<Departamento> getAllDepartamentos() {
	List< Departamento> depBD = depresp.findAll(); 
		
		if (depBD!=null && depBD.size()>0) {
			return depBD;
		}
		return new ArrayList<Departamento>();
	
	}

	@Override
	public Optional<Departamento> findDepartamentoById(Long id) {
	Optional<Departamento> departamento = null;
		
		if (id!=null) {
			departamento = depresp.findById(id);
		}
		
		return departamento;
	}

}

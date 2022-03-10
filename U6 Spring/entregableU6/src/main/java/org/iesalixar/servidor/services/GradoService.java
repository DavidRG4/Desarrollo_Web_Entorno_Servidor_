package org.iesalixar.servidor.services;

import java.util.List;

import org.iesalixar.servidor.model.Grado;
import org.springframework.security.access.event.PublicInvocationEvent;

public interface GradoService {
	public List<Grado> getAllGrados();
	public Grado insertGrado(Grado grado);
}

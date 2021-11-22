package org.iesalixar.servidor.david.dao;

import org.iesalixar.servidor.david.model.Usuario;

public interface UsuarioDaoI {
	public Usuario getUsuario(String nombre);
	public boolean registerUsuario(Usuario usuario);
}

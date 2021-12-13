package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.Usuario;

public interface UsuarioDaoI {
	public List<Usuario> getAllUsuario();

	public Usuario getUsuario(String usuario);

	public boolean removeUsuario(String usuario);

	public boolean updateUsuario(Usuario usuario);

	public boolean insertUsuario(Usuario usuario);
}

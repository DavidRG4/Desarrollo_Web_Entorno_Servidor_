package org.iesalixar.servidor.david.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.iesalixar.servidor.david.bd.ConexionBD;
import org.iesalixar.servidor.david.model.Usuario;

public class UsuarioDaoImpl implements UsuarioDaoI {

	@Override
	public Usuario getUsuario(String nombre) {

		Usuario usuario = null;

		try {

			String sql = "select * from usuarios where usuario=?";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
			statement.setString(1, nombre);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				usuario = new Usuario();
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setPassword(rs.getString("password"));
				usuario.setEmail(rs.getString("email"));
				usuario.setRole(rs.getString("role"));
				usuario.setFirstName(rs.getString("firstName"));
				usuario.setLastName(rs.getString("lastName"));

			}

			ConexionBD.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return usuario;

	}

	@Override
	public boolean registerUsuario(Usuario usuario) {
		int resultado = 0;

		try {

			String sql = "insert into usuarios values(?,?,?,?,?,?)";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
			statement.setString(1, usuario.getUsuario());
			statement.setString(3, usuario.getPassword());
			statement.setString(2, usuario.getEmail());
			statement.setString(4, usuario.getRole());
			statement.setString(5, usuario.getFirstName());
			statement.setString(6, usuario.getLastName());

			resultado = statement.executeUpdate();

			ConexionBD.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

}

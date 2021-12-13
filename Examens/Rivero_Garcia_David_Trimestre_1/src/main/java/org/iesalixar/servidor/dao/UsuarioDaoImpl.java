package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.Usuario;
import org.iesalixar.servidor.model.customers;

public class UsuarioDaoImpl implements UsuarioDaoI {

	public List<Usuario> getAllUsuario() {
		ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
		Usuario usuarios = null;
		Connection con = null;

		try {

			String sql = "select * from Usuario";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Usuario usuario = new Usuario();

				usuario.setUsuario(rs.getString("usuario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setPassword(rs.getString("password"));
				usuario.setRole(rs.getString("role"));
				usuario.setFirstName(rs.getString("firstName"));
				usuario.setLastName(rs.getString("LastName"));
				
				usuarioList.add(usuario);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return usuarioList;
	}

	public Usuario getUsuario(String usuarioEmail) {
		Connection con = null;
		Usuario usuarios = null;
		try {

			String sql = "select * from Usuario where email= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuarioEmail);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				usuarios = new Usuario();
				usuarios.setUsuario(rs.getString("usuario"));
				usuarios.setEmail(rs.getString("email"));
				usuarios.setPassword(rs.getString("password"));
				usuarios.setRole(rs.getString("role"));
				usuarios.setFirstName(rs.getString("firstName"));
				usuarios.setLastName(rs.getString("LastName"));

			}

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return usuarios;
	}


}

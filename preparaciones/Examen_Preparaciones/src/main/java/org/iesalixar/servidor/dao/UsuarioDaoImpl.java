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

	public Usuario getUsuario(String usuario) {
		Connection con = null;
		Usuario usuarios = null;
		try {

			String sql = "select * from Usuario where usuario= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
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

	public boolean removeUsuario(String usuario) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from Usuario where usuario=? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean updateUsuario(Usuario usuario) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update Usuario set email= ?, password=?,role= ?,firstName= ?,LastName= ? where usuario = ? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario.getEmail());
			statement.setString(2, usuario.getPassword());
			statement.setString(3, usuario.getRole());
			statement.setString(4, usuario.getFirstName());
			statement.setString(5, usuario.getLastName());
			statement.setString(6, usuario.getUsuario());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean insertUsuario(Usuario usuario) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into Usuario values(?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario.getEmail());
			statement.setString(2, usuario.getPassword());
			statement.setString(3, usuario.getRole());
			statement.setString(4, usuario.getFirstName());
			statement.setString(5, usuario.getLastName());
			statement.setString(6, usuario.getUsuario());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

}

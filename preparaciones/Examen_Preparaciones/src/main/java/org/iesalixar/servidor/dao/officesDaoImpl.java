package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.customers;
import org.iesalixar.servidor.model.offices;

public class officesDaoImpl implements officesDaoI{

	public List<offices> getAllOffices() {
		ArrayList<offices> officesList = new ArrayList<offices>();
		offices office = null;
		Connection con = null;
		try {

			String sql = "select * from offices";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				office = new offices();
				office.setOfficeCode(rs.getString("officeCode"));
				office.setCity(rs.getString("city"));
				office.setPhone(rs.getString("phone"));
				office.setAddressLine1(rs.getString("addressLine1"));
				office.setAddressLine2(rs.getString("addressLine2"));
				office.setState(rs.getString("state"));
				office.setCountry(rs.getString("country"));
				office.setPostalCode(rs.getString("postalCode"));
				office.setTerritory(rs.getString("territory"));

				officesList.add(office);

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return officesList;
	}

	public offices getOffices(String officeCode) {
		Connection con = null;
		offices office = null;
		try {

			String sql = "select * from offices where officeCode= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, officeCode);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				office = new offices();
				office.setOfficeCode(rs.getString("officeCode"));
				office.setCity(rs.getString("city"));
				office.setPhone(rs.getString("phone"));
				office.setAddressLine1(rs.getString("addressLine1"));
				office.setAddressLine2(rs.getString("addressLine2"));
				office.setState(rs.getString("state"));
				office.setCountry(rs.getString("country"));
				office.setPostalCode(rs.getString("postalCode"));
				office.setTerritory(rs.getString("territory"));

			}

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return office;
	}

	public boolean removeOffices(String officeCode) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from offices where officeCode=? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, officeCode);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean updateOffices(offices offices) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update offices set city= ?, phone=?,addressLine1= ?,addressLine2= ?,state= ?,country= ?,postalCode= ?,territory= ? where officeCode = ? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, offices.getCity());
			statement.setString(2, offices.getPhone());
			statement.setString(3, offices.getAddressLine1());
			statement.setString(4, offices.getAddressLine2());
			statement.setString(5, offices.getState());
			statement.setString(6, offices.getCountry());
			statement.setString(7, offices.getPostalCode());
			statement.setString(8, offices.getTerritory());
			statement.setString(9, offices.getOfficeCode());

	

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean insertOffices(offices offices) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into offices values(?,?,?,?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, offices.getOfficeCode());
			statement.setString(2, offices.getCity());
			statement.setString(3, offices.getPhone());
			statement.setString(4, offices.getAddressLine1());
			statement.setString(5, offices.getAddressLine2());
			statement.setString(6, offices.getState());
			statement.setString(7, offices.getCountry());
			statement.setString(8, offices.getPostalCode());
			statement.setString(9, offices.getTerritory());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

}

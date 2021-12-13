package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.customers;

public class customersDaoImpl implements customersDaoI {

	public List<customers> getAllCustomers() {
		ArrayList<customers> customersList = new ArrayList<customers>();
		customers customers = null;
		Connection con = null;

		try {

			String sql = "select * from customers";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				customers customer = new customers();

				customer.setCustomerNumber(rs.getInt("customerNumber"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setContactLastName(rs.getString("contactLastName"));
				customer.setContactFirstName(rs.getString("contactFirstName"));
				customer.setPhone(rs.getString("phone"));
				customer.setAddressLine1(rs.getString("addressLine1"));
				customer.setAddressLine2(rs.getString("addressLine2"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setPostalCode(rs.getString("postalCode"));
				customer.setCountry(rs.getString("country"));
				customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
				customer.setCreditLimit(rs.getDouble("creditLimit"));

				customersList.add(customer);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return customersList;
	}

	public customers getCustomers(int customerNumber, String customerName) {
		Connection con = null;
		customers customer = null;
		try {

			String sql = "select * from customers where customerNumber= ? and customerName= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customerNumber);
			statement.setString(2, customerName);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				customer = new customers();
				customer.setCustomerNumber(rs.getInt("customerNumber"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setContactLastName(rs.getString("contactLastName"));
				customer.setContactFirstName(rs.getString("contactFirstName"));
				customer.setPhone(rs.getString("phone"));
				customer.setAddressLine1(rs.getString("addressLine1"));
				customer.setAddressLine2(rs.getString("addressLine2"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setPostalCode(rs.getString("postalCode"));
				customer.setCountry(rs.getString("country"));
				customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
				customer.setCreditLimit(rs.getDouble("creditLimit"));

			}

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return customer;
	}

	public boolean removeCustomers(int customerNumber, String customerName) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from customers where customerNumber=? and customerName=?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customerNumber);
			statement.setString(2, customerName);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean updateCustomers(customers customers) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update customers set contactLastName= ?, contactFirstName=?,phone= ?,addressLine1= ?,addressLine2= ?,city= ?,state= ?,postalCode= ?,country= ?,salesRepEmployeeNumber= ?,creditLimit=? where customerNumber = ? and customerName = ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, customers.getContactLastName());
			statement.setString(2, customers.getContactFirstName());
			statement.setString(3, customers.getPhone());
			statement.setString(4, customers.getAddressLine1());
			statement.setString(5, customers.getAddressLine2());
			statement.setString(6, customers.getCity());
			statement.setString(7, customers.getState());
			statement.setString(8, customers.getPostalCode());
			statement.setString(9, customers.getCountry());
			statement.setInt(10, customers.getSalesRepEmployeeNumber());
			statement.setDouble(11, customers.getCreditLimit());
			statement.setInt(12, customers.getCustomerNumber());
			statement.setString(13, customers.getCustomerName());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean insertCustomers(customers customers) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into customers values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customers.getCustomerNumber());
			statement.setString(2, customers.getCustomerName());
			statement.setString(3, customers.getContactLastName());
			statement.setString(4, customers.getContactFirstName());
			statement.setString(5, customers.getPhone());
			statement.setString(6, customers.getAddressLine1());
			statement.setString(7, customers.getAddressLine2());
			statement.setString(8, customers.getCity());
			statement.setString(9, customers.getState());
			statement.setString(10, customers.getPostalCode());
			statement.setString(11, customers.getCountry());
			statement.setInt(12, customers.getSalesRepEmployeeNumber());
			statement.setDouble(13, customers.getCreditLimit());


			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}
}

package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.employees;

public class employeesDaoImpl implements employeesDaoI {

	@Override
	public ArrayList<employees> getAllEmployees() {
		ArrayList<employees> employeesList = new ArrayList<employees>();
		employees payments = null;
		Connection con = null;

		try {

			String sql = "select * from employees";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				employees employee = new employees();

				employee.setEmployeeNumber(rs.getString("employeeNumber"));
				employee.setLastName(rs.getString("lastName"));
				employee.setFirstName(rs.getString("firstName"));
				employee.setExtension(rs.getString("extension"));
				employee.setEmail(rs.getString("email"));
				employee.setOfficeCode(rs.getString("officeCode"));
				employee.setReportsTo(rs.getString("reportsTo"));
				employee.setJobTitle(rs.getString("jobTitle"));

				employeesList.add(employee);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return employeesList;
	}

	@Override
	public boolean insertEmployees(employees employees) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into payments values(?,?,?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, employees.getEmployeeNumber());
			statement.setString(2, employees.getLastName());
			statement.setString(3, employees.getFirstName());
			statement.setString(4, employees.getExtension());
			statement.setString(5, employees.getEmail());
			statement.setString(6, employees.getOfficeCode());
			statement.setString(7, employees.getReportsTo());
			statement.setString(8, employees.getJobTitle());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}
}

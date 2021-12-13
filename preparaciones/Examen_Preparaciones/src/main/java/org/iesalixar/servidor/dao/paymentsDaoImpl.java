package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.payments;

public class paymentsDaoImpl implements paymentsDaoI {
	@Override
	public List<payments> getAllPayments() {
		ArrayList<payments> paymentsList = new ArrayList<payments>();
		payments payments = null;
		Connection con = null;

		try {

			String sql = "select * from payments";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				payments payment = new payments();

				payment.setCustomerNumber(rs.getInt("customerNumber"));
				payment.setCheckNumber(rs.getString("checkNumber"));
				payment.setDate(rs.getString("paymentDate"));
				payment.setAmount(rs.getDouble("amount"));

				paymentsList.add(payment);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return paymentsList;
	}

	@Override
	public payments getPayments(int customerNumber, String checkNumber) {
			Connection con = null;
			payments payment = null;
			try {

				String sql = "select * from payments where customerNumber= ? and checkNumber= ?";
				PoolBD pool = new PoolBD();
				con = pool.getConnection();
				PreparedStatement statement = con.prepareStatement(sql);
				statement.setInt(1, customerNumber);
				statement.setString(2, checkNumber);

				ResultSet rs = statement.executeQuery();

				// Como el campo de búsqueda es la clave solo debería obtener un resultado
				// si no es así estaremos machacando cada vez el valor de customer y
				while (rs.next()) {

					payment = new payments();

					payment.setCustomerNumber(rs.getInt("customerNumber"));
					payment.setCheckNumber(rs.getString("checkNumber"));
					payment.setDate(rs.getString("paymentDate"));
					payment.setAmount(rs.getDouble("amount"));

				}

				con.close();

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return payment;
	}


	@Override
	public boolean removePayments(int customerNumber, String checkNumber) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from payments where customerNumber=? and checkNumber=?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customerNumber);
			statement.setString(2, checkNumber);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	@Override
	public boolean updatePayments(payments payment) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update payments set paymentDate= ?, amount=? where customerNumber = ? and checkNumber = ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, payment.getDate());
			statement.setDouble(2, payment.getAmount());
			statement.setInt(3, payment.getCustomerNumber());
			statement.setString(4, payment.getCheckNumber());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	@Override

	public boolean insertPayments(payments payment) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into payments values(?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, payment.getCustomerNumber());
			statement.setString(2, payment.getCheckNumber());
			statement.setString(3, payment.getDate());
			statement.setDouble(4, payment.getAmount());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

}

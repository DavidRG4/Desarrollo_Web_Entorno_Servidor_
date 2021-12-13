package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.Usuario;
import org.iesalixar.servidor.model.orders;

public class ordersDaoImpl implements ordersDaoI {

	public List<orders> getAllOrders() {
		ArrayList<orders> ordersList = new ArrayList<orders>();
		orders orders = null;
		Connection con = null;

		try {

			String sql = "select * from orders";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				orders order = new orders();

				order.setOrderNumber(rs.getInt("orderNumber"));
				order.setOrderDate(rs.getString("orderDate"));
				order.setRequiredDate(rs.getString("requiredDate"));
				order.setShippedDate(rs.getString("shippedDate"));
				order.setStatus(rs.getString("status"));
				order.setComments(rs.getString("comments"));
				order.setCustomerNumber(rs.getInt("customerNumber"));

				ordersList.add(order);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return ordersList;
	}

	public orders getOrders(int orderNumber) {
		Connection con = null;
		orders order = null;
		try {

			String sql = "select * from orders where orderNumber= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, orderNumber);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				order = new orders();
				order.setOrderNumber(rs.getInt("orderNumber"));
				order.setOrderDate(rs.getString("orderDate"));
				order.setRequiredDate(rs.getString("requiredDate"));
				order.setShippedDate(rs.getString("shippedDate"));
				order.setStatus(rs.getString("status"));
				order.setComments(rs.getString("comments"));
				order.setCustomerNumber(rs.getInt("customerNumber"));

			}

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return order;
	}

	public boolean removeOrders(int orderNumber) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from orders where orderNumber=? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, orderNumber);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean updateOrders(orders orders) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update orders set orderDate= ?, requiredDate=?,shippedDate= ?,status= ?,comments= ?,customerNumber=?  where orderNumber = ? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, orders.getOrderDate());
			statement.setString(2, orders.getRequiredDate());
			statement.setString(3, orders.getShippedDate());
			statement.setString(4, orders.getStatus());
			statement.setString(5, orders.getComments());
			statement.setInt(6, orders.getCustomerNumber());
			statement.setInt(7, orders.getOrderNumber());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean insertOrders(orders orders) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into orders values(?,?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, orders.getOrderDate());
			statement.setString(2, orders.getRequiredDate());
			statement.setString(3, orders.getShippedDate());
			statement.setString(4, orders.getStatus());
			statement.setString(5, orders.getComments());
			statement.setInt(6, orders.getCustomerNumber());
			statement.setInt(7, orders.getOrderNumber());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}
}

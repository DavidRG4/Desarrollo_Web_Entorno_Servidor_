package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.BD.PoolBD;
import org.iesalixar.servidor.model.Usuario;
import org.iesalixar.servidor.model.products;

public class productsDaoImpl implements productsDaoI {

	public List<products> getAllProducts() {
		ArrayList<products> productsList = new ArrayList<products>();
		products products = null;
		Connection con = null;

		try {

			String sql = "select * from products";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				products product = new products();

				product.setProductCode(rs.getString("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setProductLine(rs.getString("productLine"));
				product.setProductScale(rs.getString("productScale"));
				product.setProductVendor(rs.getString("productVendor"));
				product.setProductDescription(rs.getString("productDescription"));
				product.setQuantityInStock(rs.getInt("quantityInStock"));
				product.setBuyPrice(rs.getDouble("buyPrice"));
				product.setMSRP(rs.getDouble("MSRP"));
				productsList.add(product);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return productsList;

	}

	public products getProducts(String productCode) {
		Connection con = null;
		products products = null;
		try {

			String sql = "select * from products where productCode= ?";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productCode);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				products = new products();
				products.setProductCode(rs.getString("productCode"));
				products.setProductName(rs.getString("productName"));
				products.setProductLine(rs.getString("productLine"));
				products.setProductScale(rs.getString("productScale"));
				products.setProductVendor(rs.getString("productVendor"));
				products.setProductDescription(rs.getString("productDescription"));
				products.setQuantityInStock(rs.getInt("quantityInStock"));
				products.setBuyPrice(rs.getDouble("buyPrice"));
				products.setMSRP(rs.getDouble("MSRP"));

			}

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return products;
	}

	public boolean removeProducts(String productCode) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "delete from products where productCode=? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productCode);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean updateProducts(products products) {
		int resultado = 0;
		Connection con = null;
		try {

			String sql = "update products set productName= ?, productLine=?,productScale= ?,productVendor= ?,productDescription= ?,quantityInStock= ?,buyPrice= ? ,MSRP= ? where productCode = ? ";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, products.getProductName());
			statement.setString(2, products.getProductLine());
			statement.setString(3, products.getProductScale());
			statement.setString(4, products.getProductVendor());
			statement.setString(5, products.getProductDescription());
			statement.setInt(6, products.getQuantityInStock());
			statement.setDouble(7, products.getBuyPrice());
			statement.setDouble(8, products.getMSRP());
			statement.setString(9, products.getProductCode());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	public boolean insertProducts(products products) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into Usuario values(?,?,?,?,?,?,?,?,?)";
			PoolBD pool = new PoolBD();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, products.getProductName());
			statement.setString(2, products.getProductLine());
			statement.setString(3, products.getProductScale());
			statement.setString(4, products.getProductVendor());
			statement.setString(5, products.getProductDescription());
			statement.setInt(6, products.getQuantityInStock());
			statement.setDouble(7, products.getBuyPrice());
			statement.setDouble(8, products.getMSRP());
			statement.setString(9, products.getProductCode());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}
}

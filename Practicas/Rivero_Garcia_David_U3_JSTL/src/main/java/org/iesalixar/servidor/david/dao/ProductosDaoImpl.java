package org.iesalixar.servidor.david.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.david.bd.ConexionBD;
import org.iesalixar.servidor.david.model.Productos;

public class ProductosDaoImpl implements ProductosDaoI {

	@Override
	public ArrayList<Productos> getAllProducts() {
		ArrayList<Productos> productList = new ArrayList<>();

		try {

			String sql = "select * from products";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Productos producto = new Productos();

				producto.setProductCode(rs.getString("productCode"));
				producto.setProductName(rs.getString("productName"));
				producto.setProductLine(rs.getString("productLine"));
				producto.setProductScale(rs.getString("productScale"));

				producto.setProductVendor(rs.getString("productVendor"));
				producto.setProductDescription(rs.getString("productDescription"));
				producto.setQuantityInStock(rs.getInt("quantityInStock"));
				producto.setBuyPrice(rs.getDouble("buyPrice"));
				producto.setMSRP(rs.getDouble("MSRP"));

				productList.add(producto);
			}

			ConexionBD.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return productList;
	}

	@Override
	public Productos getProduct(String productCode) {

		Productos productos = null;

		try {

			String sql = "select * from products where productCode= ?";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
			statement.setString(1, productCode);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				productos = new Productos();
				productos.setProductCode(rs.getString("productCode"));
				productos.setProductName(rs.getString("productName"));
				productos.setProductLine(rs.getString("productLine"));
				productos.setProductScale(rs.getString("productScale"));

				productos.setProductVendor(rs.getString("productVendor"));
				productos.setProductDescription(rs.getString("productDescription"));
				productos.setQuantityInStock(rs.getInt("quantityInStock"));
				productos.setBuyPrice(rs.getDouble("buyPrice"));
				productos.setMSRP(rs.getDouble("MSRP"));

			}

			ConexionBD.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return productos;
	}

}

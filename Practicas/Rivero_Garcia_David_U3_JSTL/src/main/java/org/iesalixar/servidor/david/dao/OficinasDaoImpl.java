package org.iesalixar.servidor.david.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.david.bd.ConexionBD;
import org.iesalixar.servidor.david.model.Oficinas;

public class OficinasDaoImpl implements OficinasDaoI {

	@Override
	public ArrayList<Oficinas> getAllOfices() {

		ArrayList<Oficinas> oficeList = new ArrayList<>();

		try {

			String sql = "select * from offices";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Oficinas oficina = new Oficinas();
				
				oficina.setOfficeCode(rs.getString("officeCode"));
				oficina.setCity(rs.getString("city"));
				oficina.setPhone(rs.getString("phone"));
				oficina.setAddressLine1(rs.getString("addressLine1"));
				oficina.setAddressLine2(rs.getString("addressLine2"));

				oficina.setState(rs.getString("state"));
				oficina.setCountry(rs.getString("country"));
				oficina.setPostalCode(rs.getString("postalCode"));
				oficina.setTerritory(rs.getString("territory"));

				oficeList.add(oficina);
			}

			ConexionBD.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return oficeList;
	}

}

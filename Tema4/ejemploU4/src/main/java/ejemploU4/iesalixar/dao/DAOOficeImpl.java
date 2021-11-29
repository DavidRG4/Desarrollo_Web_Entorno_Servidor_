package ejemploU4.iesalixar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejemploU4.iesalixar.BD.PoolBD;
import ejemploU4.iesalixar.model.Oficina;

public class DAOOficeImpl implements DAOOfice {

	@Override
	public List<Oficina> getAllOficina() {
		ArrayList<Oficina> OficeList = new ArrayList<>();
		
		try {
			PoolBD poolBD = new PoolBD();
			String sql = "select * from offices";
			Connection con;
			con = poolBD.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Oficina oficina = new Oficina();

				oficina.setOfficeCode(rs.getString("officeCode"));
				oficina.setCity(rs.getString("city"));
				oficina.setPhone(rs.getString("phone"));
				oficina.setAddressLine1(rs.getString("addressLine1"));
				oficina.setAddressLine2(rs.getString("addressLine2"));
				oficina.setState(rs.getString("state"));
				oficina.setCountry(rs.getString("country"));
				oficina.setPostalCode(rs.getString("postalCode"));
				oficina.setTerritory(rs.getString("territory"));
				
				OficeList.add(oficina);

			}

			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return OficeList;
	}

}

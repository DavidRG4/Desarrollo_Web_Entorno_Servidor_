package patronDAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAOImplements implements PaymentSao {

	public boolean createPayments(Integer customerNumb, Integer checkNumb, String paymentDate, Integer amount) {
		Connection con = ConexionBD.getConexion();
		try {
			// comprobacion si esta el customerNumber
			int numeroFila = 0;
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from payments where customerNumber == customerNumb");
			while (rs.next()) {
				numeroFila++;
			}

			// Crear o no crear la nueva fila Payments

			if (numeroFila == 0) {
				try {
					// Insert de datos
					String insert = "INSERT INTO payments (customerNumber,checkNumber,paymentDate,amount) VALUES (?,?,?,?)";
					PreparedStatement pt = con.prepareStatement(insert);
					pt.setInt(1, customerNumb);
					pt.setInt(2, checkNumb);
					pt.setString(3, paymentDate);
					pt.setInt(4, amount);

					pt.executeUpdate();
					System.out.println("Se inserto sin problemas el pago");
				} catch (SQLException throwables) {
					throwables.printStackTrace();
				}
				return true;
				//Si no se puede insertar
			} else {
				System.out.println("No se puede crear este customer");
				return false;
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return false;

	}

	public List<Payments> getPayments() {
		Connection con = ConexionBD.getConexion();
		ArrayList<Payments> lista_pagos = new ArrayList<Payments>();

		try {
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");

			while (rs.next()) {
				Payments p = new Payments(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
				lista_pagos.add(p);
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

		return lista_pagos;
	}

}

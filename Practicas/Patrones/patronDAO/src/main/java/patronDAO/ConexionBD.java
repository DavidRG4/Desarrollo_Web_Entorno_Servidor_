package patronDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private static Connection con = null;
	private static final String conUrl = "jdbc:mysql://0.0.0.0:3336/classicmodels?user=root&password=root"
			+ "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static Connection getConexion() {

		try {

			if (con == null) {
				con = DriverManager.getConnection(ConexionBD.conUrl);
				System.out.println("Conexión realizada correctamente");
			}

		} catch (SQLException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		
		return con;
	}
	
	public static void close() {
		try {
			if (con != null) con.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

}


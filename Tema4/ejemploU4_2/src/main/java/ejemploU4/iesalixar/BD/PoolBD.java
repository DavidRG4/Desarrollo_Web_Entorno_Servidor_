package ejemploU4.iesalixar.BD;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class PoolBD {

	public DataSource dataSource;

	public PoolBD() {
		initDataSource();

	}

	public void initDataSource() {
		Context initContext;

		BasicDataSource basicDataSource = null;
		try {
			initContext = new InitialContext();
			basicDataSource = (BasicDataSource) initContext.lookup("java:/comp/env/jdbc/ConexionMariadb");

		} catch (NamingException e) {
			e.printStackTrace();
		}
		dataSource = basicDataSource;
	}

	public Connection getConnection() {
		Connection result = null;
		try {
			result = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}

package org.iesalixar.servidor.BD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;

public class PoolBD {
	public BasicDataSource dataSource;

	public PoolBD() {
		initDataSource();
	}

	private void initDataSource() {

		Properties properties = new Properties();

		try {
			properties.load(
					Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		BasicDataSource basicDataSource = new BasicDataSource();

		basicDataSource.setDriverClassName(properties.getProperty("db.classForName"));

		basicDataSource.setUsername(properties.getProperty("db.username"));
		basicDataSource.setPassword(properties.getProperty("db.password"));

		String url = properties.getProperty("db.url") + "//" + properties.getProperty("db.host") + ":"
				+ properties.getProperty("db.port") + "/" + properties.getProperty("db.dbname");

		basicDataSource.setUrl(url);
		basicDataSource.setMaxTotal(Integer.parseInt(properties.getProperty("db.pool.maxTotal")));
		basicDataSource.setMaxIdle(Integer.parseInt(properties.getProperty("db.pool.maxIdle")));

		dataSource =  basicDataSource;

	}

	public Connection getConnection() {

		Connection connection = null;

		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}

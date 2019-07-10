package com.murdock.examples.dropwizard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQL_conn {
	public Connection connect() {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "xup6rmp cj/6";
		Connection conn = null;
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

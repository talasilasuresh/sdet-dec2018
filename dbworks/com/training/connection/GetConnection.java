package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

	static Connection connection;
	public PreparedStatement ps, ps1, ps2;
	public ResultSet rs, rs1, rs3;

	public static Connection getMySqlConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sdetdec?autoReconnect=true&useSSL=false", "root", "Hexaware@123");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 

	}

	public Connection getOracleConnection() {
		return null;
	}

}

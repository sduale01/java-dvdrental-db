package com.dvdrentaldb;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAdapter {
	private final static String url = "jdbc:postgresql://localhost:5432/dvdrental";
	private final static String user = "nopcallowed";
	private final static String password = "";
	
 //	Database variables
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
//	Connect to database
	public static Connection connect() {
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to database!");	
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
//	Disconnect from database
	public static void disconnect() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			
			if (rs != null) {
				rs.close();
			}
			
			if (conn != null) {
				conn.close();
			}

			System.out.println("Disconnected from database!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

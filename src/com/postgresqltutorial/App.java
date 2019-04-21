package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	private final String url = "jdbc:postgresql://localhost:5432/dvdrental";
	private final String user = "nopcallowed";
	private final String password = "";
	
	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to database!");	
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.connect();
	}
}

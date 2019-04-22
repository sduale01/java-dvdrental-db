package com.dvdrentaldb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoutesDvdRental extends DbAdapter {
	public static void name(String[] args) throws Exception{
	}
	
//	make a GET request
	public static void getActors() throws Exception{
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT actor_id, first_name, last_name FROM actor;");
			
			ResultSet rs = statement.executeQuery();
			displayActors(rs);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void getActorById(int actorID) {
		String SQL = "SELECT actor_id, first_name, last_name FROM actor WHERE actor_id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, actorID);
			
			ResultSet rs = pstmt.executeQuery();
			displayActors(rs);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void displayActors(ResultSet rs) throws SQLException{
		while (rs.next()) {
			System.out.println(rs.getString("actor_id") 
					+ " " + rs.getString("first_name") 
					+ " " + rs.getString("last_name"));
			
		}
		
	}
}

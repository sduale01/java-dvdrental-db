package com.dvdrentaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RoutesDvdRental extends DbAdapter {
	public static void name(String[] args) throws Exception{
		get();
	}
	
	public static ArrayList<String> get() throws Exception{
		try {
			Connection con = connect();
			PreparedStatement statement = con.prepareStatement("SELECT first_name, last_name FROM actor;");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while (result.next()) {
				System.out.println(result.getString("first_name") + " " + result.getString("last_name"));
				
				array.add(result.getString("last_name"));
			}
			System.out.println("All actors have been selected");
			return array;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return null;
	}
}
